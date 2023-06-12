package com.practice.design_pattern.iterator;

public class DogHouse implements Aggregate {

    private Dog[] dogs;
    private int last = 0;

    public DogHouse(int maxSize){
        this.dogs = new Dog[maxSize];
    }

    public Dog getDogAt(int index){
        return dogs[index];
    }

    public void appendDog(Dog dog){
        this.dogs[last] = dog;
        last++;
    }

    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new DogHouseIterator(this);
    }
}
