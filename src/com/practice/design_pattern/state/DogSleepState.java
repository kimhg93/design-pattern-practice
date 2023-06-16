package com.practice.design_pattern.state;

// ConcreteState (상태에 대한 동작)
public class DogSleepState implements DogState {

    @Override
    public void callName() {
        System.out.println("대답이 없다");
    }

    @Override
    public void order(Jindo jindo) {
        System.out.println("개야 일어나라");
        jindo.setState(new DogAwakeState());
    }

    @Override
    public String toString() {
        return "개가 자고있는 상태";
    }
}
