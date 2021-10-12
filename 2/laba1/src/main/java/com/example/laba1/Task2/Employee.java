package com.example.laba1.Task2;

public class Employee {
    private Pet _pet;
    private Car _car;
    private  int _age;
    private String _name;

    public Employee(Pet pet, Car car) {
        _pet = pet;
        _car = car;
    }
    public Employee(){ System.out.println("Метод инициализации конструктора Employee"); }



    public void setPet  (Pet pet)     { _pet = pet; }
    public void setCar  (Car car)     { _car = car; }
    public void setName (String name) { _name = name; }
    public void setAge  (int age)     { _age = age; }

    public String getName() { return _name; }
    public int getAge() { return  _age; }

    public void callPet(){
        _pet.petSay();
    }
    public void startCar(){
        _car.sayBeep();
    }


}
