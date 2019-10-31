package com.smgvalen.helloworld.controllers;

import com.smgvalen.helloworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  private UtilityService utilities;

  @Autowired
  public UtilityController(UtilityService utilities) {
    this.utilities = utilities;
  }
  // # First steps
  // - Have a main page at `/useful`
  // - This should contain links to all available utilities detailed below
  @GetMapping(value = "/useful")
  public String showUtilities() {
    return "main";
  }
  // ## Colored Background
  // - Have an endpoint `/useful/colored`
  //     - should display an empty page with a random color background
  @GetMapping(value = "/useful/colored")
  public String colorTheBackground(Model model) {
    model.addAttribute("color", utilities.randomColor());
    return "colored";
  }

  // ## Email validator
  // - Endpoint at `/useful/email` with a queryparam (@RequestParam)
  // - Have a link at the main page to an example: `/useful/email?email=is@this.valid`
  // - Create a `validateEmail` method in the `UtilityService`
  //     - check if the string contains a `@` and a `.`
  // - Display the following to the user
  //     - `is@this.valid is a valid email address` in green
  //     - `not_valid_email.com is not a valid email address` in red
  @GetMapping(value = "/useful/email")
  public String validatedEmail(Model model, @RequestParam(value = "email") String email) {
    boolean isValid = utilities.validateEmail(email);
    if (isValid) {
      model.addAttribute("text", email + " is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("text", email + " is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "validation";
  }
  // ## Caesar encoder/decoder
  // _Caesar coding is just shifting every character in the text with a specific number of amount in the alphabet, coded `example` with `1` is `fybnqmf`._
  // - Endpoints for encoding and decoding with a `text` and `number` query param
  // - Link at the main page for both
  // - For encoding use the `number` value, for decoding use the `-number` value
  @GetMapping (value = "/useful/caesar")
  public String encoderDecoder(Model model, @RequestParam String encodingText, @RequestParam int number) {
    model.addAttribute("text", utilities.caesar(encodingText, number));
    return "caesar";
  }




}
