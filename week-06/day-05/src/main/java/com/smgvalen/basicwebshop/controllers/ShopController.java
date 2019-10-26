package com.smgvalen.basicwebshop.controllers;

import com.smgvalen.basicwebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

  private ArrayList<ShopItem> inventory = new ArrayList<>();

  public ShopController() {
    inventory
        .add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    inventory.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    inventory.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    inventory.add(new ShopItem("Woken", "Chicken with fried rice and Wokin sauce", 119.0, 100));
    inventory.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  @GetMapping(value = "/webshop")  // http://localhost:8080/webshop
  public String greeting(Model model) {
    model.addAttribute("name", " World!");
    return "webshop";

  }

  @GetMapping(value = "/shopList")
  public String addItems(Model model) {
    model.addAttribute("itemList", inventory);
    return "listing";
  }

  @GetMapping(value = "/only-available")
  public String showAvailable(Model model) {
    List<ShopItem> availableItems = inventory.stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
    model.addAttribute("itemList", availableItems);
    return "listing";
  }

  @GetMapping(value = "/cheapest-first")
  public String sortCheapestFirst(Model model) {
    List<ShopItem> sortedShopList = inventory.stream()
        .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("itemList", sortedShopList);
    return "listing";
  }


}
