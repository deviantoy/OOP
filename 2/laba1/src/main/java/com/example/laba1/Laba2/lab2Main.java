package com.example.laba1.Laba2;

import com.example.laba1.Laba2.Config.LabConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lab2Main {
    public static void main(String[] args) {

        // Сканирование классов на предмет аннотаций
        Task1();
        for(int i = 0; i < 10; i++)
            System.out.println("-------------------------------------------------------------------------------------");
        /// Без сканирования, вручную задаём все бины через класс конфигуратор
        /// Чтобы правильно работало, в каждом из пяти классов нужно закомментить строку @Component("...")
        /// Но тогда не будет работать первое задание, поэтому его нужно тоже закомментить
//        Task2();
    }

    public static void Task1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("lab2Context.xml");
        Human _human = context.getBean("getHuman", Human.class);
        context.close();
    }
    public static void Task2() {
        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(LabConfig.class);

        Human _human = context2.getBean("getHuman", Human.class);
        System.out.println("Возраст хьюмана: "+_human.getAge());
        context2.close();
    }
}
