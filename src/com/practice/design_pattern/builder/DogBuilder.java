package com.practice.design_pattern.builder;

public class DogBuilder {

    private String type;
    private String name;
    private String gender;
    private int age;
    private int weight;

    public DogBuilder type(String type){
        this.type = type;
        return this;
    }

    public DogBuilder name(String name){
        this.name = name;
        return this;
    }

    public DogBuilder gender(String gender){
        this.gender = gender;
        return this;
    }

    public DogBuilder age(int age){
        this.age = age;
        return this;
    }

    public DogBuilder weight(int weight){
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
