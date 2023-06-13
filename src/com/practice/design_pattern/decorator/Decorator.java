package com.practice.design_pattern.decorator;

// decorator
public class Decorator implements DogComponent {

    DogComponent jindo;

    public Decorator(DogComponent dogComponent){
        this.jindo = dogComponent;
    }

    @Override
    public void action() {
        jindo.action();
    }
}
