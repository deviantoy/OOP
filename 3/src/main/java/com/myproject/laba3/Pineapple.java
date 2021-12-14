package com.myproject.laba3;

import org.springframework.stereotype.Component;

@Component("pineappleBean")
public class Pineapple extends Item {

    public Pineapple(String _name) { this.name = _name; }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void goToStore(Store store) {
        store.PushToStore(this);
    }
}
