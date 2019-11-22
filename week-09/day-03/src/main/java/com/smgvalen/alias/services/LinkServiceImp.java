package com.smgvalen.alias.services;

import com.smgvalen.alias.models.Link;
import com.smgvalen.alias.repositories.LinkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImp implements ILinkService {

  private LinkRepository linkRepository;

  @Autowired
  public LinkServiceImp(LinkRepository linkRepository) {
    this.linkRepository = linkRepository;
  }

  public LinkServiceImp() {
  }

  @Override
  public void save(Link link) {
    link.generateSecretCode();
    linkRepository.save(link);
  }

  @Override
  public Link findByAlias(String alias) {
    return linkRepository.findByAlias(alias);
  }

  @Override
  public void incrementHitcount(Link link) {
    link.setHitcount(link.getHitcount()+1);
    linkRepository.save(link);
  }

  @Override
  public List<Link> getLinks() {
    return  linkRepository.findAll();
  }

  @Override
  public Link findLinkById(Long id) {
    return findLinkById(id);
  }

  @Override
  public void delete(Long id){
    linkRepository.deleteById(id);
  }
}
