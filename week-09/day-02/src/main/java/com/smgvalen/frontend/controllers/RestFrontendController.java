package com.smgvalen.frontend.controllers;

import com.smgvalen.frontend.models.Appended;
import com.smgvalen.frontend.models.ArrayResult;
import com.smgvalen.frontend.models.ArrayResultInArray;
import com.smgvalen.frontend.models.ArrayService;
import com.smgvalen.frontend.models.Dountil;
import com.smgvalen.frontend.models.DountilResult;
import com.smgvalen.frontend.models.ErrorResponse;
import com.smgvalen.frontend.models.FrontendObject;
import com.smgvalen.frontend.models.Greeter;
import com.smgvalen.frontend.models.InputForArray;
import com.smgvalen.frontend.models.Log;
import com.smgvalen.frontend.models.LogEntry;
import com.smgvalen.frontend.models.SithText;
import com.smgvalen.frontend.models.YodaText;
import com.smgvalen.frontend.services.DountilService;
import com.smgvalen.frontend.services.LogService;
import com.smgvalen.frontend.services.SithReverser;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFrontendController {

  private DountilService dountilService;
  private ArrayService arrayService;
  private LogService logService;
  private SithReverser sithReverserService;

  @Autowired
  public RestFrontendController(DountilService dountilService, ArrayService arrayService,
      LogService logService, SithReverser sithReverserService) {
    this.dountilService = dountilService;
    this.arrayService = arrayService;
    this.logService = logService;
    this.sithReverserService = sithReverserService;
  }

  @GetMapping("/doubling")
  public ResponseEntity getDoubledNumber(
      @RequestParam(name = "input", required = false) Integer input) {
    String inputValue = input == null ? "input: null"
        : input.toString(); // le kell kezelni az Integer paramétert, mivel lehet null
    logService.save(new Log("/doubling", inputValue));
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new FrontendObject(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new ErrorResponse("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity getGreeting(
      @RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    logService.save(new Log("/greeter", "name: " + name + ", title: " + title));
    if (name != null && title != null) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new Greeter("Oh, hi there " + name + ", my dear " + title + "!"));
    } else if (name != null && title == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide a title!"));
    } else if (name == null && title != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide a name!"));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide a name and a title!"));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity getAppendA(@PathVariable String appendable) {
    logService.save(new Log("/appenda", appendable));
    if (appendable != null) {

      return ResponseEntity.status(HttpStatus.OK).body(new Appended(appendable));
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntilTheAction(@PathVariable String action,
      @RequestBody Dountil dountil) {
    logService.save(new Log("/dountil", action + ", " + dountil.getUntil().toString()));
    if (action.equals("sum")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new DountilResult(dountilService.countSum(dountil)));
    } else if (action.equals("factor")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new DountilResult(dountilService.getFactor(dountil)));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide a number"));
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity handleArray(@RequestBody(required = false) InputForArray input) {
    logService
        .save(new Log("/arrays", input.getWhat() + ", " + Arrays.toString(input.getNumbers())));
    if (input.getNumbers().length != 0) {
      if (input.getWhat().equals("sum")) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(new ArrayResult(arrayService.sum(input)));
      } else if (input.getWhat().equals("multiply")) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(new ArrayResult(arrayService.multiply(input)));
      } else if (input.getWhat().equals("double")) {
        return ResponseEntity.status(HttpStatus.OK)
            .body(new ArrayResultInArray(arrayService.doubling(input)));
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide what to do with the numbers!"));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorResponse("Please provide what to do with the numbers!"));
    }
  }

  @GetMapping("/log")
  public ResponseEntity getLogs() {
    LogEntry logEntry = new LogEntry(logService.findAll(), logService.findAll().size());
    return ResponseEntity.status(HttpStatus.OK)
        .body(logEntry);

  }

  @PostMapping("/sith")
  public ResponseEntity responseLikeYoda(@RequestBody SithText text) {
    if (text.getText().length() != 0) {
      return ResponseEntity.status(HttpStatus.OK).body(new YodaText(sithReverserService.convertStrings(text.getText())));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse("Feed me some text you have to, padawan young you are. Hmmm."));
    }
  }
}
