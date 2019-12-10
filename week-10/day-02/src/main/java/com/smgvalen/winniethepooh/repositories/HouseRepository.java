package com.smgvalen.winniethepooh.repositories;

import com.smgvalen.winniethepooh.models.House;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Long> {

  Optional<House> findById(Long id);

  @Query(value = "select sum(h.number_of_rooms) from House h where h.color = :color", nativeQuery = true)
  Integer countRoomsByColor(@Param("color") String color);
}
