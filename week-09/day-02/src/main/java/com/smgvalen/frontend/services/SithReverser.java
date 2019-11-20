package com.smgvalen.frontend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class SithReverser {

  public SithReverser() {
  }

  public String convertStrings(String input) {
    Random random = new Random();
    List<String> randomWords = new ArrayList<>();
    randomWords.add("Arrgh.");
    randomWords.add("Uhmm.");
    randomWords.add("Err..err.err.");
    randomWords.add("Barff.");
    randomWords.add("Heee.");
    String yoda_text = "";
    String temp = "";

    String[] sentences = input.toLowerCase().split("\\.");

    for (int i = 0; i < sentences.length; i++) {

      String[] words = sentences[i].trim().split("\\s+");

      for (int j = 0; j < words.length - 1; j += 2) {
        words[1] = words[1].substring(0,1).toUpperCase() + words[1].substring(1);
        yoda_text += words[j + 1] + " " + words[j] + " ";

        if (words.length % 2 != 0) {
          temp = words[words.length - 1];
        }
      }
      yoda_text = yoda_text + temp + ". " + randomWords.get(random.nextInt(3)) + " ";
    }
    return yoda_text.substring(0, yoda_text.length()-1);
  }
}

//And responds with a simplified yoda speak simply switching every 2 words:
//{
//  "sith_text": "Is this example my sentence. Arrgh. Uhmm. For just fun. Err..err.err."
//}
//it keeps the capital positions and the end of sentences
//if a sentence doesn't contain even number of words, it leaves the last as is
//always puts (one or two) random things at the end of sentences
//if the input doesn't contain the text or its empty, respond with:
//{
//  "error": "Feed me some text you have to, padawan young you are. Hmmm."
//}