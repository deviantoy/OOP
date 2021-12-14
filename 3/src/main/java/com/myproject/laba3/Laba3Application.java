package com.myproject.laba3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
public class Laba3Application {
    public static void main(String[] args) {
        System.out.println("Результат работы метода: "+Task());
    }

    public static String Task() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Store _store = context.getBean("getStore", Store.class);
        Item apple = context.getBean("getApple", Apple.class);
        Item pineapple = context.getBean("getPineapple", Pineapple.class);
        Item pen = context.getBean("getPen", Pen.class);
        Item melon = context.getBean("getMelon", Melon.class);

        _store.PushToStore(apple);
        _store.PushToStore(pineapple);
        _store.PushToStore(melon);
        _store.PushToStore(pen);

        _store.printStoredItems();
        _store.getItemFromStore(2); // afterReturning
        System.out.println();
        _store.getItemFromStore(5); // afterThrowing
        System.out.println();

        int num = Integer.parseInt("oop");
        context.close();
        return "Task: Метод отработал без ошибок!";
    }
}