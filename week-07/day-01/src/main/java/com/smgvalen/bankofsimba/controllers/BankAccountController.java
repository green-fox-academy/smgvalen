package com.smgvalen.bankofsimba.controllers;

import com.smgvalen.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccountList = new ArrayList<>();

  public BankAccountController() {
    bankAccountList.add(new BankAccount("Simba", 2000, "lion"));
  }

  @GetMapping(value = "/show")
  public String showAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccountList);
    return "index";
  }

  @GetMapping(value = "/text")
  public String showText(Model model){
    model.addAttribute("texts", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }



  @GetMapping(value="/showAccounts")


}
