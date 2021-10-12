package com.example.laba1.Task2;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args){
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            FirstTask(context);
            SecondTask(context);
            context.close();
    }

    public static void FirstTask(ClassPathXmlApplicationContext context) {
        System.out.println("This is first task");
        Employee employee = context.getBean("myEmployee", Employee.class);
        employee.callPet();
        employee.startCar();
    }

    private static void SecondTask(ClassPathXmlApplicationContext context) {
        System.out.println("This is second task");
        Employee employee = context.getBean("myEmployee2", Employee.class);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());

    }

}
