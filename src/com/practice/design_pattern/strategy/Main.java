package com.practice.design_pattern.strategy;

/**
 *
 * 특정 동작, 알고리즘을 동적으로 교체해야 하거나 교체가 빈번히 발생할 때, 조건 분기문을 대체할때 사용한다.
 * 클래스수가 증가하여 복잡도가 높아질 수 있다.
 *
 * 유연성과 확장성: 알고리즘을 독립적인 전략 클래스로 캡슐화하고, 컨텍스트에서 해당 전략을 동적으로 교체할 수 있다. 알고리즘을 쉽게 추가하거나 변경할 수 있어 유연성과 확장성이 높아진다.
 * 코드 재사용과 중복 제거: 비슷한 알고리즘을 여러 객체에서 사용해야 할 경우, 알고리즘을 전략으로 정의하고 재사용할 수 있다. 코드 중복을 제거하고 재사용성을 높일 수 있습니다.
 * 단일 책임 원칙 준수: 객체의 역할과 책임을 분리하여 단일 책임 원칙을 준수하는 설계를 가능하게 한다. 전략 클래스는 알고리즘을 캡슐화하고, 컨텍스트 클래스는 해당 전략을 사용하여 동작을 수행 한다.
 *
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();

        System.out.println("===========================");

        dog.setStrategy(new JindoStrategy());
        dog.bark();

        System.out.println("===========================");

        dog.setStrategy(new SapsareeStrategy());
        dog.bark();

    }
}
