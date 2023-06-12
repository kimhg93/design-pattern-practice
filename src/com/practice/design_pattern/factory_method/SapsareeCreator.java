package com.practice.design_pattern.factory_method;

// 삽살개 creator(factory)
public class SapsareeCreator extends PetCreator {

    @Override
    protected Pet createPet() {
        return new Sapsaree();
    }
}
