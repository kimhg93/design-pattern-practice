package com.practice.design_pattern.decorator;

public class JindoDecoratorBlue extends Decorator {

    public JindoDecoratorBlue(DogComponent dogComponent) {
        super(dogComponent);
    }

    @Override
    public void action() {
        super.action();
        decoAction();
    }

    void decoAction(){
        System.out.println("파란옷!");
    }
}
