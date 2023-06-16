package com.practice.design_pattern.facade;

public class Jindo {
    private String name;

    public Jindo(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + "가 짖습니다.");
    }

    public void run() {
        System.out.println(name + "가 달립니다.");
    }
}
