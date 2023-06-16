package com.practice.design_pattern.factory_method;

// creator(factory)
public abstract class PetFactory {

    public void name(){
        Pet pet =  createPet();
        System.out.println(pet.getName());
    }

    protected abstract Pet createPet();
}
