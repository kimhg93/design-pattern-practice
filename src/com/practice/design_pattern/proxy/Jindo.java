package com.practice.design_pattern.proxy;

// real subject
public class Jindo implements Dog {

    @Override
    public void action() {
        System.out.println("배를 깐다!");
    }

}
