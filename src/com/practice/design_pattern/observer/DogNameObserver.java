package com.practice.design_pattern.observer;

// Observer 구현체
public class DogNameObserver implements Observer {

    private DogNameGenerator nameGenerator;

    public DogNameObserver(DogNameGenerator nameGenerator){
        this.nameGenerator = nameGenerator;
    }

    @Override
    public void update() {
        String name = nameGenerator.getName();
        System.out.println("상태 업테이트 " + name);
    }

}
