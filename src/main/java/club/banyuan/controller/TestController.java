package club.banyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

  @GetMapping("/blog/{id}")
  String getBlogById(@RequestParam Integer id) {
    return id.toString();
  /*String getBlogById(@PathVariable int id) {
    return String.valueOf(id);*/
  }
}
