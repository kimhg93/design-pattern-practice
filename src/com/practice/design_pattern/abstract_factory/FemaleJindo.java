package com.practice.design_pattern.abstract_factory;

// abstract product 1 implements 1
public class FemaleJindo implements Jindo {
    @Override
    public void eat() {
        System.out.println("암놈 진돗개가 밥을 먹는다.");
    }
}
