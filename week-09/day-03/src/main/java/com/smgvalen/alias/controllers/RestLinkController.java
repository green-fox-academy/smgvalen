package com.smgvalen.alias.controllers;

import com.smgvalen.alias.exceptions.ForbiddenException;
import com.smgvalen.alias.exceptions.NoContentException;
import com.smgvalen.alias.exceptions.NotFoundException;
import com.smgvalen.alias.models.Code;
import com.smgvalen.alias.models.Link;
import com.smgvalen.alias.services.LinkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/links")
public class RestLinkController {

  private LinkService linkService;

  @Autowired
  public RestLinkController(LinkService linkService) {
    this.linkService = linkService;
  }

  @GetMapping
  public ResponseEntity<List<Link>> showLinks() {
    return ResponseEntity.status(200)
        .body(linkService.getLinks());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity deleteLink(@RequestBody Code secretCode,
      @PathVariable(required = false) Long id) {
    Link deletableLink = linkService.findLinkById(id);
    if (deletableLink == null || deletableLink.getId() == null) {
      throw new NotFoundException();
    } else if (deletableLink.getSecretCode() != null && secretCode.getSecretCode()
        .equals(deletableLink.getSecretCode())) {
      linkService.delete(deletableLink.getId());
      throw new NoContentException();
    } else {
      throw new ForbiddenException();
    }
  }
/*
  @DeleteMapping("/{id}")
  public ResponseEntity deleteLink(@RequestBody Code secretCode,
      @PathVariable(required = false) Long id) {
    String result = linkService.deleteLink(id, secretCode.getSecretCode());
    if (result.equals("deleted")) {
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    } else if (result.equals("wrong code")) {
      return new ResponseEntity(HttpStatus.FORBIDDEN);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  } */
}

//If it doesn't exists respond with 404 status code
//If it exists but the provided secret code doesn't match respond with 403 status code
//If it exists and the provided secret code matches delete the entry from the database and respond with 204 status code