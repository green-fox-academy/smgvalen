package com.smgvalen.alias.services;

import com.smgvalen.alias.models.Link;
import java.util.List;

public interface LinkService {

  void generateSecretCodeAndSave(Link link);

  Link findByAlias(String alias);

  void incrementHitcount(Link link);

  List<Link> getLinks();

  Link findLinkById(Long id);

  void delete(Long id);

  public String deleteLink(Long id, String code);
}
