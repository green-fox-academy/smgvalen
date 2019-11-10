package com.smgvalen.reddit.services;

import com.smgvalen.reddit.models.Post;
import java.util.List;

public interface InterPostService {

  List<Post> findAll();

  void save(Post post);

  void delete(Long id);

  Post findById(Long id);

  void voteUpById(Long id);

  void voteDownById(Long id);




}
