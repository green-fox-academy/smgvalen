package com.smgvalen.helloworld.services;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  // - Create a `validateEmail` method in the `UtilityService`
  //     - check if the string contains a `@` and a `.`
  public boolean validateEmail(String email) {
    if (email.contains("@") && email.contains(".")) {
      return true;
    } else {
      return false;
    }
  }

  // ## Caesar encoder/decoder
  // _Caesar coding is just shifting every character in the text with a specific number of amount in the alphabet, coded `example` with `1` is `fybnqmf`._
  // - Endpoints for encoding and decoding with a `text` and `number` query param
  // - Link at the main page for both
  // - Service method:
  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for (int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char) (((int) text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}