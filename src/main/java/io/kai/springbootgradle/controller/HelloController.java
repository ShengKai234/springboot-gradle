package io.kai.springbootgradle.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("/index1")
    public ModelAndView hello() {
		System.err.println("hello");
		ModelAndView model = new ModelAndView("index1");
        model.addObject("msg", "Hello world");
        return model;
    }
	
	 @RequestMapping("/index2")
     String home() {
		 System.err.println("index2");
       return "index/index2";
     }
	 
	 @GetMapping("/index3")
     String index() {
		 System.err.println("index3");
       return "index/index3";
     }
}
