package com.practice.design_pattern.strategy;

public class Dog {

    private DogStrategy strategy;

    public void setStrategy(DogStrategy strategy){
        this.strategy = strategy;
    }

    public void bark(){
        if(strategy == null) System.out.println("전략이 설정되지 않음");
        else strategy.bark();
    }

}
