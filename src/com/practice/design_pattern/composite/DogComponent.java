package com.practice.design_pattern.composite;

// component(root)
public interface DogComponent {

    void add(DogComponent component);
    void remove(DogComponent component);
    void action();
    DogComponent getChild(int index);

}
