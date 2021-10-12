package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Interfaces.PlaceOfResidence;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component("getApartment")
public class Apartment implements PlaceOfResidence {
    public Apartment() {System.out.println("Я конструктор квартиры!");}

    @Override
    public void kindOfResidence() {
        System.out.println("Я есть квартира!");
    }

    @PostConstruct
    public void init() {
        System.out.println("Я инициализатор квартиры!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Я уничтожитель квартиры!");
    }
}
