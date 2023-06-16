package com.practice.design_pattern.abstract_factory;

// abstract product 1 implements 2
public class MaleJindo implements Jindo {
    @Override
    public void eat() {
        System.out.println("숫놈 진돗개가 밥을 먹는다.");
    }
}
