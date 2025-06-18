package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// test

@Controller
public class MainController {
  @GetMapping("/main")
  public String main_main(Model model)
  {
	  model.addAttribute("main_html", "main/home");
	  return "main";
  }
}