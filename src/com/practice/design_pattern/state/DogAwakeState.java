package com.practice.design_pattern.state;

// ConcreteState (상태에 대한 동작)
public class DogAwakeState implements DogState {

    @Override
    public void callName() {
        System.out.println("진돗개 입니다");
    }

    @Override
    public void order(Jindo jindo) {
        System.out.println("개야 잠자라");
        jindo.setState(new DogSleepState());
    }

    @Override
    public String toString() {
        return "개가 깨어있는 상태";
    }
}
