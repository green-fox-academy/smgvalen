package com.smgvalen.reddit.services;

import com.smgvalen.reddit.models.Post;
import com.smgvalen.reddit.repositories.PostRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements InterPostService{

  @Autowired
  private PostRepo postRepository;

  public PostServiceImp(PostRepo postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> findAll() {
    List<Post> postList = new ArrayList<>();
    postRepository.sortByRatingDesc().forEach(postList::add);
    return postList;
  }

  @Override
  public void save(Post post) {
    postRepository.save(post);
  }

  @Override
  public void delete(Long id) {
  postRepository.deleteById(id);
  }

  @Override
  public Post findById(Long id) {
    return postRepository.findById(id).orElse(null);
  }

  //az alábbiakan gondolkodj még, biztos van egyszerűbb

  @Override
  public void voteUpById(Long id) {
    postRepository.findById(id).orElse(null)
        .setVote(postRepository.findById(id).orElse(null)
        .getVote()+1);
    postRepository.save(postRepository.findById(id).orElse(null));
  }

  @Override
  public void voteDownById(Long id) {
    postRepository.findById(id).orElse(null)
        .setVote(findById(id).getVote()-1);
    postRepository.save(postRepository.findById(id).orElse(null));
  }


}
