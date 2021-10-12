package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Interfaces.Work;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("getSecondWork")
public class Programmer implements Work {

    public Programmer() { System.out.println("Я конструктор программиста!");}

    @Override
    public void slogan() {
        System.out.println("Я слоган программиста!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Я инициализатор программиста!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Я уничтожитель программиста!");
    }


}
