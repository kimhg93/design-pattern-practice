package com.practice.design_pattern.factory_method;

// 진돗개 creator(factory)
public class JindoFactory extends PetFactory {
    @Override
    protected Pet createPet() {
        return new Jindo();
    }
}
