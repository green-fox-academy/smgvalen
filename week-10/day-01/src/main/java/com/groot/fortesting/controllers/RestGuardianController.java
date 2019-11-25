package com.groot.fortesting.controllers;


import com.groot.fortesting.models.Arrow;
import com.groot.fortesting.models.Cargo;
import com.groot.fortesting.models.FillingCargo;
import com.groot.fortesting.models.Groot;
import com.groot.fortesting.models.MyError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGuardianController {

  Cargo cargo = new Cargo();

  @GetMapping("/groot")
  public ResponseEntity translateGroot(
      @RequestParam(required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("I am Groot!"));
    } else {
      return ResponseEntity.status(200).body(new Groot(message, "I am Groot!"));
    }
  }

  @GetMapping("/yondu")
  public ResponseEntity respondSpeedOfArrow(
      @RequestParam(required = false) Double distance,
      @RequestParam(required = false) Double time) {
    if (distance == null || time == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("Missing something, pal?"));
    } else {
      return ResponseEntity.status(200).body(new Arrow(distance, time));
    }
  }

  @GetMapping("/rocket")
  public ResponseEntity showTheAmmo() {
    return ResponseEntity.status(HttpStatus.OK).body(cargo);
  }

  @GetMapping("/rocket/fill")
  public ResponseEntity fillTheShip(
      @RequestParam(required = false) String caliber,
      @RequestParam(required = false) Integer amount) {
    if (caliber == null || amount == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new MyError("You are an asshole, Quill!"));
    } else {
      cargo.fillCargo(caliber, amount);
      return ResponseEntity.status(HttpStatus.OK).body(new FillingCargo(caliber, amount, cargo.getShipstatus(), cargo.getReady()));
    }
  }
}
