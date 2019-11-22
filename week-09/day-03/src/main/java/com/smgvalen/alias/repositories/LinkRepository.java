package com.smgvalen.alias.repositories;

import com.smgvalen.alias.models.Link;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends CrudRepository<Link, Long> {

  Link findByAlias(String alias);

}
