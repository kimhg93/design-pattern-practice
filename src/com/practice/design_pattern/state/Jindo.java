package com.practice.design_pattern.state;

// context (상태를 가지고 있음)
public class Jindo {

    private DogState dogState;

    public Jindo(){
        this.dogState = new DogSleepState();
    }

    public void setState(DogState dogState){
        this.dogState = dogState;
    }

    public void callName(){
        this.dogState.callName();
    }

    public void order(){
        dogState.order(this);
    }

    public void printState(){
        System.out.println(dogState.toString());
    }
}
