package com.practice.design_pattern.composite;

// composite
public class MaleDog implements DogComponent {

    private String name;

    public MaleDog(String name){
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("이름 : " + name);
    }

    @Override
    public void add(DogComponent component) {
    }

    @Override
    public void remove(DogComponent component) {
    }

    @Override
    public DogComponent getChild(int index) {
        return null;
    }
}
