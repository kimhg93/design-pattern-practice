package com.practice.design_pattern.abstract_factory;

public class MaleDogFactory implements AbstractFactory {

    @Override
    public Jindo createJindo() {
        return new MaleJindo();
    }

    @Override
    public Sapsaree createSapsaree() {
        return new MaleSapsaree();
    }
}
