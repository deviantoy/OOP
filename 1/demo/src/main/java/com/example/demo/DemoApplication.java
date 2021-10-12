package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public static String Hello_page(@RequestParam(value = "MyParam",defaultValue = "World")String name){
		return String.format("Hello %s", name);
	}
	@GetMapping("/about")
	public static String about_page(){
		return "about us";
	}
	@GetMapping("/options")
	public static String options_page(@RequestParam(value = "MyParam",defaultValue = "")String option){
		return Objects.equals(option,"")?"options":"not a option"; //параметр есть  после ? - 1, нет - 2.
	}
}
