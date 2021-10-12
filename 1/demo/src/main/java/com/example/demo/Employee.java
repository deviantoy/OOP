package com.example.demo;


public class Employee {
    private Pet pet;
    private String name;
    private int age;
    private Car car;


        public Employee(Pet pet,Car car){ //DI
        this.pet = pet;
        this.car = car;
    }
    public void setPet(Pet pet){ this.pet = pet;}
    public void setName(String name){ this.name = name;}
    public void setAge(int age){ this.age = age;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public void setCar(Car car){ this.car = car;}
    public void callYourPet(){
        System.out.println("Hey!");
        pet.say();
    }
    public void callYourCar(){
        System.out.println("Start Engine!");
        car.beebeep();
    }
    public Employee(){

    }
}
