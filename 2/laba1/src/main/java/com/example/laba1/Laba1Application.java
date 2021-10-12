package com.example.laba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@SpringBootApplication
@RestController
public class Laba1Application {

    public static void main(String[] args) {
        SpringApplication.run(Laba1Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName", defaultValue="World") String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/about")
    public String sayAbout() {
        return "About us";
    }
    @GetMapping("/options")
    public String sayOptions(@RequestParam(value="withParam", defaultValue="") String option) {
        return Objects.equals(option, "") ? "options" : "not an option";
    }
}
