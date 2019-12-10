package com.smgvalen.alias.controllers;

import com.smgvalen.alias.models.Link;
import com.smgvalen.alias.services.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class LinkController {

  private LinkService service;

  @Autowired
  public LinkController(LinkService service) {
    this.service = service;
  }

  @GetMapping(value = "/")
  public String get(Model model,
      @RequestParam(required = false) String url,  // nyilván kell egy url
      @RequestParam(required = false) String alias, // ez is alap
      @RequestParam(required = false) String secretCode,
      // azért, hogy redirectnél a postmapping elküldje az indexre sikeres, eddig nem létező mentésnél
      @RequestParam(required = false) String status) {  // ez itt homály, és minden ami vele kapcsolatos
    //
    model.addAttribute("status",
        status == null ? "default scenario will not show this text" : status);
    model.addAttribute("alias", alias);
    model.addAttribute("secretCode", secretCode);

    Link linkToDisplay = new Link();

    //ha már létezik a link, hagyja az aliast és urlt az inputfieldekben első conditional az urlt, a második az aliast csekkolja ???
    if (status != null && status.equals("exists")) {
      linkToDisplay.setAlias(alias);
      linkToDisplay.setUrl(url);
    }
    // ez adja vissza a htmlnek a formot
    model.addAttribute("link", linkToDisplay);
    return "index";
  }

  @PostMapping(value = "/save-link")
  public String save(@ModelAttribute(name = "link") Link linkToAdd) {
    if (service.findByAlias(linkToAdd.getAlias()) == null) {
      service.generateSecretCodeAndSave(linkToAdd);
      return "redirect:/?alias=" + linkToAdd.getAlias() + "&secretCode=" + linkToAdd.getSecretCode()
          + "&status=non-exists";
    } else {
      return "redirect:/?status=exists&url=" + linkToAdd.getUrl() + "&alias=" + linkToAdd
          .getAlias();
    }
  }
  //If the alias exists it should increment the hit count and redirect to the URL otherwise respond with 404 status code
  @GetMapping(value = "/a/{alias}")
  public String directToUrl(@PathVariable String alias) {
    Link linkInStorage = service.findByAlias(alias);
    if (linkInStorage != null) {  // ha van ilyen, //mentse, és// növelje a hitcountot.
      service.incrementHitcount(linkInStorage);
      // service.save(linkInStorage);
      return "redirect:" + linkInStorage.getUrl();
    } else {
      //throw new NotFoundException();
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "hakunamatata");
    }
  }
}

