package com.smgvalen.winniethepooh.repositories;

import com.smgvalen.winniethepooh.models.Inhabitant;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InhabitantRepository extends CrudRepository<Inhabitant, Long> {

  Optional<Inhabitant> findById(Long id);

  Inhabitant findByName(String name);

}
