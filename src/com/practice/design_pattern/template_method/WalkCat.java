package com.practice.design_pattern.template_method;

public class WalkCat extends WalkPet {

    @Override
    protected void walk() {
        System.out.println("고양이가 좋아하는지 모르겠다");
    }

    @Override
    protected void giveWater() {
        System.out.println("고양이가 물을 마신다.");
    }

    @Override
    protected void cleanPoop() {
        System.out.println("고양이가 쳐다본다.");
    }

    @Override
    protected void washFeet() {
        System.out.println("고양이가 사라졌다.");
    }

}
