package com.myproject.laba3;

import org.springframework.stereotype.Component;

@Component("penBean")
public class Pen extends Item {

    public Pen(String _name) { this.name = _name; }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void goToStore(Store store) {
        store.PushToStore(this);
    }
}
