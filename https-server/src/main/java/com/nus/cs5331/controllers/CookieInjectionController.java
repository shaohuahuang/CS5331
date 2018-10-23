package com.nus.cs5331.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieInjectionController {
  @GetMapping("/")
  public String cookieShadowingChecking(HttpServletResponse response){
    return "cookie";
  }
  
  @GetMapping("/overshadow")
  public String cookieShadowing(HttpServletResponse response){
    Cookie cookie = new Cookie("project", "cs5331");
    cookie.setSecure(true);
    cookie.setPath("/");
    response.addCookie(cookie);
    return "cookie";
  }
}
