package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Interfaces.Gender;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("getGender")
public class Man implements Gender {
    private String _name;

    public Man() { System.out.println("Я конструктор мужчины!"); }

    public void setName(String name) { _name = name; }

    public String getName() { return _name; }

    @Override
    public void SayGender() {
        System.out.println("Я мужчина!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Я инициализатор мужчины!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Я уничтожитель мужчины!");
    }
}
