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
  public RedditApplication(PostRepo postRepo) {
    this.postRepo = postRepo;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {

    //  postRepo.save(new Post("this a trending post", "www.google.com"));
    // postRepo.save(new Post("hot post", "www.google.com/maps"));
    // Post post1 = new Post("Spring Boot/Thymeleaf:SFj - utazik a POJO",
    //    "https://www.youtube.com/watch?v=_J-a1D72t8E&list=PLyriihBWoulywcSbZijjeSIHH19uJZG5q&index=18");
    //  postRepo.save(post1);
    //  Post post2 = new Post("Custom Query - StudentRepo", "https://github.com/green-fox-academy/zigzag-syllabus/blob/master/Material%20Review/Week08/Day03/src/main/java/com/gfa/sqladvanced/repositories/StudentRepository.java");
    // postRepo.save(post2);
    //  Post post3 = new Post("Reddit Project", "https://github.com/green-fox-academy/teaching-materials/blob/master/project/reddit/templating/java-thymeleaf.md");
    //  postRepo.save(post3);
  }
}
