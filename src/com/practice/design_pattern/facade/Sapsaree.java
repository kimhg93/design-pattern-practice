package com.practice.design_pattern.facade;

public class Sapsaree {
    private String name;

    public Sapsaree(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(name + "가 점프합니다.");
    }

    public void playFetch() {
        System.out.println(name + "가 공놀이를 합니다.");
    }
}


