package com.nus.cs5331.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CookieInjectionController {
  @GetMapping("/a")
  public Object cookieShadowing(HttpServletResponse response){
    Cookie cookie = new Cookie("project", "cs5331");
    cookie.setPath("/a");
    response.addCookie(cookie);
    return null;
  }
}
