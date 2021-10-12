package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Interfaces.Work;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("getFirstWork")
public class Teacher implements Work {

    public Teacher() { System.out.println("Я конструктор преподавателя!"); }

    @Override
    public void slogan() { System.out.println("Я гордый преподаватель!"); }

    @PostConstruct
    public void init() {
        System.out.println("Я инициализатор преподавателя!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Я уничтожитель преподавателя!");
    }
}
