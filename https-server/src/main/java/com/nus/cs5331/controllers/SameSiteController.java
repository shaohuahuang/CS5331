package com.nus.cs5331.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class SameSiteController {
  @GetMapping("/strict")
  public String getStrictPage(HttpServletResponse response) {
    response.setHeader("Set-Cookie", "project=cs5331; SameSite=strict");
    return "index";
  }
  
  @GetMapping("/lax")
  public String getLaxPage(HttpServletResponse response) {
    response.setHeader("Set-Cookie", "project=cs5331; SameSite=lax");
    return "index";
  }
  
  @GetMapping("/default")
  public String getDefaultPage(HttpServletResponse response) {
    response.setHeader("Set-Cookie", "project=cs5331;");
    return "index";
  }
}
