package io.kai.springbootgradle.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping
    public Map hello() {
        Map map = new HashMap();
        map.put("say", "hello");
        return map;
    }
}
