package com.practice.design_pattern.template_method;

public class WalkDog extends WalkPet {

    @Override
    protected void walk() {
        System.out.println("개가 좋아한다.");
    }

    @Override
    protected void giveWater() {
        System.out.println("개가 물을 마신다.");
    }

    @Override
    protected void cleanPoop() {
        System.out.println("개가 눈치를 본다.");
    }

    @Override
    protected void washFeet() {
        System.out.println("개가 도망가려 한다.");
    }

}
