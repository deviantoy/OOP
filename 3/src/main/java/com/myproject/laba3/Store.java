package com.myproject.laba3;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;


@Scope("singleton")
@EnableAspectJAutoProxy
public class Store extends AbstractStore {

    public Store() {
    }

    private final ArrayList<Item> _store = new ArrayList<Item>();

    @Override
    public void PushToStore(Item item) {
        _store.add(item);
        System.out.printf("Запихиваем товар '%s' в хранилище", item.getName());
        System.out.println();
        System.out.println();
    }

    public void printStoredItems() {
        System.out.println("--------------------------------");
        System.out.println("Товары, хранящиеся на складе:");
        for (Item item : _store) {
            System.out.println(item.name);
        }
        System.out.println("--------------------------------");
    }

    @Override
    public void getItemFromStore(int index) {
        String itemName;

        try {
            Item item = _store.get(index);
            itemName = item.name;
            _store.remove(index);
            System.out.printf("Мы взяли товар '%s' со склада!", itemName);

        } catch (IndexOutOfBoundsException e1) {
            System.out.println("IndexOutOfBoundsException in method getItemFromStore caught");
        } catch (Exception e2) {
            System.out.println("Another Exception in method getItemFromStore caught");
        }
    }
}