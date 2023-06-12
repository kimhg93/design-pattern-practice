package com.practice.design_pattern.singleton;

public class PetSingleton {

    private static PetSingleton instance; // static 선언하여 전역 접근, 인스턴스 공유

    private String type;
    private String name;

    private PetSingleton(){ // 생성자 private 선언하여 외부에서 생성 불가, 상속 불가
    }

    public static PetSingleton getInstance(){
        if(instance == null){
            instance = new PetSingleton();
            System.out.println("생성 되었다!");
        } else System.out.println("이미 있었다!");

        return instance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalSingleton{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
