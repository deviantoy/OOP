package com.myproject.laba3;

public class Item implements CanSendToStore {
    String name;

    public String getName() {
        return this.name;
    }
    
    @Override
    public void goToStore(Store store) {  }
}
