package com.practice.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

// Subject 구현체
public class DogNameGenerator implements NameGenerator {

    private List<Observer> observers = new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i=0; i<observers.size(); i++){
            observers.get(i).update();
        }
    }
}
