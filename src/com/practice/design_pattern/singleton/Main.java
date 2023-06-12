package com.practice.design_pattern.singleton;

/**
 * 특정 클래스의 인스턴스가 하나만 생성되도록 보장한다. 자원을 관리하거나 상태를 공유하는 경우 사용
 * ex) 로깅, DB 연결, 캐시, configuration, Thread Pool 등
 *
 * 하나의 인스턴스만 생성 : 상태를 공유할 수 있고 자원을 절약함
 * 전역적 접근 가능 : 전역 접근이 가능하여 다른 객체 사이의 데이터 공유가 용이
 * 인스턴스 생성 시점 제어 : getInstance() 메서드를 호출하는 시점에서 인스턴스가 생성됨, 필요한 시점까지 인스턴스를 생성하지 않을 수 있다.
 * 인스턴스 상태 유지  :  한 번 생성된 인스턴스를 유지함, 해당 인스턴스의 상태를 유지할 수 있다.
 */

public class Main {

    public static void main(String[] args) {
        PetSingleton petSingleton = PetSingleton.getInstance(); // 최초 호출 객체 생성
        petSingleton.setType("Dog");
        petSingleton.setName("황구");
        System.out.println(petSingleton.toString());

        PetSingleton petSingleton2 = PetSingleton.getInstance(); // 이미 존재
        System.out.println(petSingleton2.toString());

        petSingleton2.setType("Cat");
        petSingleton2.setName("애옹");
        System.out.println(petSingleton2.toString());
    }

}
