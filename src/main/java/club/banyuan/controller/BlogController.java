package club.banyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

  @GetMapping("/user/{username}")
  String getBlogByUser() {
    return null;
  }
}
