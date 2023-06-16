package com.practice.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

// leaf
public class FemaleDog implements DogComponent {

    private String name;
    private List<DogComponent> child;

    public FemaleDog(String name){
        this.name = name;
        child = new ArrayList<>();
    }

    @Override
    public void action() {
        System.out.println("이름 : " + name);

        for (DogComponent component : child) {
            component.action();
        }
    }

    public void add(DogComponent component){
        child.add(component);
    }

    public void remove(DogComponent component){
        child.remove(component);
    }

    public DogComponent getChild(int index){
        return child.get(index);
    }
}
