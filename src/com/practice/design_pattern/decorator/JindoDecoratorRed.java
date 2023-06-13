package com.practice.design_pattern.decorator;

public class JindoDecoratorRed extends Decorator {

    public JindoDecoratorRed(DogComponent dogComponent) {
        super(dogComponent);
    }

    @Override
    public void action() {
        super.action();
        decoAction();
    }

    void decoAction(){
        System.out.println("빨간옷!");
    }
}
