package com.practice.design_pattern.abstract_factory;

public class FemaleDogFactory implements AbstractFactory {
    @Override
    public Jindo createJindo() {
        return new FemaleJindo();
    }

    @Override
    public Sapsaree createSapsaree() {
        return new FemaleSapsaree();
    }
}
