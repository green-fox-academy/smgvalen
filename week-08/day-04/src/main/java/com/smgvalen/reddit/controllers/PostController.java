package com.smgvalen.reddit.controllers;

import com.smgvalen.reddit.models.Post;
import com.smgvalen.reddit.services.InterPostService;
import java.awt.print.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  private InterPostService postService;

  public PostController(InterPostService postService){
    this.postService = postService;
  }

  @GetMapping({"", "/{page}"})
  public String showMainPage(@PathVariable(name = "page", required = false) Integer page,  Model model) {
    if ( page == null || page == 0) {
      page = 1;
    }

    model.addAttribute("posts", postService.findAll(page));
    model.addAttribute("page", page);
    return "main";
  }

  @GetMapping("/submit")
  public String submitNewPost(@ModelAttribute (name="post") Post post){
    return "submit";
  }

  @PostMapping("/submit")
  public String saveNewPost(@ModelAttribute (name = "post") Post post){
    postService.save(post);
    return "redirect:/";
  }

  @GetMapping("/{id}/voteUp")
  public String voteUpPost(@PathVariable (name= "id") Long id, Model model){
    postService.voteUpById(id);
    return "redirect:/";
  }
@GetMapping("/{id}/voteDown")
  public String voteDownPost(@PathVariable(name="id") Long id){
    postService.voteDownById(id);
    return "redirect:/";
}


}
