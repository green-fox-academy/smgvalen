package com.smgvalen.alias.controllers;

import com.smgvalen.alias.exceptions.ForbiddenException;
import com.smgvalen.alias.exceptions.NoContentException;
import com.smgvalen.alias.exceptions.NotFoundException;
import com.smgvalen.alias.models.Link;
import com.smgvalen.alias.services.ILinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLinkController {

  private ILinkService linkService;

  @Autowired
  public RestLinkController(ILinkService linkService) {
    this.linkService = linkService;
  }

  @GetMapping("/api/links")
  public ResponseEntity showLinks() {
    return ResponseEntity.status(200)
        .body(linkService.getLinks());
  }

  @DeleteMapping("api/links/{id}")
  public ResponseEntity deleteLink(@RequestBody Link link,
      @PathVariable(required = false) Long id) {
    Link deletableLink = linkService.findLinkById(id);
    if (deletableLink == null || deletableLink.getId() == null) {
      throw new NotFoundException();
    } else if (!deletableLink.getSecretCode().equals(link.getSecretCode())) {
      throw new ForbiddenException();
    } else if (deletableLink.getSecretCode().equals(link.getSecretCode())) {
      linkService.delete(deletableLink.getId());
      throw new NoContentException();
    } else {
      return null;
    }
  }
}
//If it doesn't exists respond with 404 status code
//If it exists but the provided secret code doesn't match respond with 403 status code
//If it exists and the provided secret code matches delete the entry from the database and respond with 204 status code