package com.practice.design_pattern.adapter;

// 어댑터를 이용해 고양이를 개로 바꿔보자
public class AdaptorCatToDog implements Dog{

    private Cat cat;

    public AdaptorCatToDog(Cat cat){
        this.cat = cat;
    }

    @Override
    public void eatSomething() {
        cat.destroySomething();
    }

    @Override
    public void runFromHouse() {
        cat.runFromOwner();
    }
}
