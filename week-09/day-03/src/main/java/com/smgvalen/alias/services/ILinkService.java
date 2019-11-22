package com.smgvalen.alias.services;

import com.smgvalen.alias.models.Link;
import java.util.List;

public interface ILinkService {

  void save(Link link);
  Link findByAlias(String alias);
  void incrementHitcount(Link link);
  List<Link> getLinks();
  Link findLinkById(Long id);
  void delete(Long id);

}
