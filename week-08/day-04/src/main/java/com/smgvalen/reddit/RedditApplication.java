package com.smgvalen.reddit;

import com.smgvalen.reddit.models.Post;
import com.smgvalen.reddit.repositories.PostRepo;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

  private PostRepo postRepo;

  @Autowired
  public RedditApplication(PostRepo postRepo){
    this.postRepo = postRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {

    postRepo.save(new Post("this a trending post", "www.google.com"));
    postRepo.save(new Post("hot post", "www.google.com/maps"));
  }
}
