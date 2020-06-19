package com.obtk.buy.proxy;

import com.obtk.buy.buy;
import com.obtk.buy.buy2;

public class proxy implements buy {

    private buy2 buy2;

    public void buy(String name){
        buy2.buy(name);
    }
}
