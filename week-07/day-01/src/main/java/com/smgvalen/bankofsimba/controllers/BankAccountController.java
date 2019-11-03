package com.smgvalen.bankofsimba.controllers;

import com.smgvalen.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccountList;

  public BankAccountController() {
    bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    bankAccountList.add(new BankAccount("Zordon", 1700, "lion", false));
    bankAccountList.add(new BankAccount("Nala", 1000, "lion", true));
    bankAccountList.add(new BankAccount("Timon", 700, "meerkat", true));
    bankAccountList.add(new BankAccount("Rafiki", 500, "baboon", true));
    bankAccountList.add(new BankAccount("Zazu", 120, "hornbill", true));
  }

  @GetMapping(value = "/show")
  public String showAccounts(Model model, @ModelAttribute(name="accountToAdd") BankAccount accountToAdd) {
    model.addAttribute("bankAccounts", bankAccountList);
    model.addAttribute("accountToAdd", accountToAdd);
    return "/index";
  }

  @GetMapping(value = "/text")
  public String showText(Model model){
    model.addAttribute("texts", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @PostMapping(value ="/raise")
  public String raise(@RequestParam int animalIndex){
    if(bankAccountList.get(animalIndex).isKing()){
      bankAccountList.get(animalIndex).setBalance(bankAccountList.get(animalIndex).getBalance() + 100);
    }else{
      bankAccountList.get(animalIndex).setBalance(bankAccountList.get(animalIndex).getBalance() + 10);
    }
    return "redirect:/show";
  }

  @PostMapping(value= "/add")
  public String addNewAccount(@ModelAttribute(name="accountToAdd") BankAccount accountToAdd) {
    bankAccountList.add(accountToAdd);
    return "redirect:/show";
  }
}
