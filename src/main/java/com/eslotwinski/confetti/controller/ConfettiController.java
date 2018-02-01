package com.eslotwinski.confetti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfettiController {

  @RequestMapping("/")
  @ResponseBody
  public String listConfetti() {
    return "list all confetti";
  }

  @RequestMapping("/confetti")
  @ResponseBody
  public String singleConfetti() {
    return "Show single confetti";
  }
}
