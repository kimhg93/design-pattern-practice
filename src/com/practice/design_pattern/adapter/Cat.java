package com.practice.design_pattern.adapter;


public class Cat {

    void destroySomething() {
        System.out.println("뭔가를 부순다.");
    }

    void runFromOwner(){
        System.out.println("주인에게서 도망친다.");
    }

}
