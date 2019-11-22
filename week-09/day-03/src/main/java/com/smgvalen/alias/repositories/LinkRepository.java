package com.smgvalen.alias.repositories;

import com.smgvalen.alias.models.Link;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

  Link findByAlias(String alias);
  List<Link> findAll();
  Link findLinkById(Long id);

}
