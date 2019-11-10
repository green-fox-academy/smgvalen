package com.smgvalen.reddit.repositories;

import com.smgvalen.reddit.models.Post;
import java.awt.print.Pageable;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {

 // @Query
  //List<Post> findByIdrOrderByVoteDesc(Long id);

  @Query(value = "select * from post order by vote desc", nativeQuery = true)
  List<Post> sortByRatingDesc();

}
