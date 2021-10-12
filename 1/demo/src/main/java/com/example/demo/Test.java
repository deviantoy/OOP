package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet",Pet.class);
//        Person person = new Person(pet);
        Employee person = context.getBean("myPerson", Employee.class); //Ioc передаём управление на создание/управление spring-контейнеру
        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.callYourPet();
        person.callYourCar();
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
