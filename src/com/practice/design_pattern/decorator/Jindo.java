package com.practice.design_pattern.decorator;

// subject
public class Jindo implements DogComponent {

    @Override
    public void action() {
        System.out.println("옷좀 입어라");
    }
}
