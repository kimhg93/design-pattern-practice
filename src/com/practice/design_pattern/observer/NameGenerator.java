package com.practice.design_pattern.observer;

// Subject 인터페이스
interface NameGenerator {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
