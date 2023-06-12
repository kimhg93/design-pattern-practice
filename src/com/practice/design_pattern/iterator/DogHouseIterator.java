package com.practice.design_pattern.iterator;

public class DogHouseIterator implements Iterator {

    private DogHouse dogHouse;
    private int index;

    public DogHouseIterator(DogHouse dogHouse){
        this.dogHouse = dogHouse;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < dogHouse.getLength()){
            return true;
        } else return false;
    }

    @Override
    public Object next() {
        Dog dog = dogHouse.getDogAt(index);
        index++;
        return dog;
    }
}
