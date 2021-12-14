package com.myproject.laba3;

import org.springframework.stereotype.Component;

@Component("appleBean")
public class Apple extends Item {

    public Apple(String _name) {  this.name = _name; }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void goToStore(Store store) {
        store.PushToStore(this);
    }
}
