package com.smgvalen.alias.services;

import com.smgvalen.alias.models.Link;
import com.smgvalen.alias.repositories.LinkRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImp implements LinkService {

  private LinkRepository linkRepository;

  @Autowired
  public LinkServiceImp(LinkRepository linkRepository) {
    this.linkRepository = linkRepository;
  }

  public LinkServiceImp() {
  }

  @Override
  public void generateSecretCodeAndSave(Link link) {
    if (link.getSecretCode() == null) {
      link.generateSecretCode();
    }
    linkRepository.save(link);
  }

  @Override
  public Link findByAlias(String alias) {
    return linkRepository.findByAlias(alias);
  }

  @Override
  public void incrementHitcount(Link link) {
    link.setHitcount(link.getHitcount() + 1);
    linkRepository.save(link);
  }

  @Override
  public List<Link> getLinks() {
    return linkRepository.findAll();
  }

  @Override
  public Link findLinkById(Long id) {
    return linkRepository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    linkRepository.delete(findLinkById(id));
  }

  @Override
  public String deleteLink(Long id, String code) {
    Optional<Link> link = linkRepository.findById(id);

    if (link.isPresent()) {
      if (code.equals(link.get().getSecretCode())) {
        linkRepository.deleteById(id);
        return "deleted";
      } else {
        return "wrong code";
      }
    } else {
      return "item not found";
    }
  }
}

