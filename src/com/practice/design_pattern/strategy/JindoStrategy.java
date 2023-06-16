package com.practice.design_pattern.strategy;

// 전략1
public class JindoStrategy implements DogStrategy {

    @Override
    public void bark() {
        System.out.println("진돗개가 멍멍 짖는다");
    }
}
