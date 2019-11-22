package com.smgvalen.alias.services;

import com.smgvalen.alias.models.Link;

public interface ILinkService {

  void save(Link link);
  Link findByAlias(String alias);
  void incrementHitcount(Link link);

}
