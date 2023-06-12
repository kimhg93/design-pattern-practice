package com.practice.design_pattern.factory_method;

// 진돗개 creator(factory)
public class JindoCreator extends PetCreator {
    @Override
    protected Pet createPet() {
        return new Jindo();
    }
}
