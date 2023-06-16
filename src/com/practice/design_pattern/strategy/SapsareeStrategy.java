package com.practice.design_pattern.strategy;

// 전략2
public class SapsareeStrategy implements DogStrategy {

    @Override
    public void bark() {
        System.out.println("삽살개가 왈왈 짖는다.");
    }

}
