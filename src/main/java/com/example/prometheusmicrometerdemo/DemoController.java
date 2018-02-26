package com.example.prometheusmicrometerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET, path = "/sleep")
    public Map<String, Integer> sleep() throws InterruptedException {
        int rand = Math.abs(new Random().nextInt() % 1000);
        Thread.sleep(rand);

        return new HashMap<String, Integer>() {{
            put("sleep", rand);
        }};
    }

    @RequestMapping("/greeting")
    public Map<String, String> greeting() {
        return new HashMap<String, String>() {{
            put("hello", "world");
        }};
    }
}
