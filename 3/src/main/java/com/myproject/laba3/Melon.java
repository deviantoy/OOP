package com.myproject.laba3;

public class Melon extends Item {

    public Melon(String _name) { this.name = _name; }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void goToStore(Store store) {
        store.PushToStore(this);
    }
}
