package com.practice.design_pattern.template_method;

// 동물을 산책시키는 템플릿
public abstract class WalkPet {

    public final void walkAnimal(){ // 템플릿 메소드
        walk(); // 산책
        giveWater(); // 물 주기
        cleanPoop(); // 똥 치우기
        washFeet(); // 발 씻기
    }

    protected abstract void walk();
    protected abstract void giveWater();
    protected abstract void cleanPoop();
    protected abstract void washFeet();

}
