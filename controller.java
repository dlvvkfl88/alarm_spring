package com.example.wonjang;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "<h4>반값</h4>";
    }
    
    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "피싱사이트에요";
    }



}
