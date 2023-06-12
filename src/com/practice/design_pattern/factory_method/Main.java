package com.practice.design_pattern.factory_method;

/**
 * 객체 생성을 서브 클래스에게 위임하고, 클라이언트 코드와 구체적인 객체 생성 로직을 분리함으로써 유연성과 확장성을 제공
 *
 * Product(인터페이스 or 추상클래스) : 팩토리 메소드가 생성한 객체들이 구현해야 하는 메소드를 포함
 * ConcreteProduct(실제 제품) : Product 인터페이스를 구현한 실제 객체입니다. 팩토리 메소드에 의해 생성
 * Creator or Factory(생성자, 인터페이스 or 추상클래스) : 제품 객체를 생성하는 팩토리 메소드를 정의
 * ConcreteCreator(실제 생성자) : Creator 클래스를 상속받거나 구현하여 팩토리 메소드를 구체적으로 구현
 *
 * 객체 생성의 캡슐화 : 팩토리 메소드 패턴은 객체 생성을 하위 클래스에게 위임함으로써 객체 생성 로직을 캡슐화한다.
 * 오직 팩토리 메소드를 통해서만 객체를 생성할 수 있어 객체 생성과 사용의 분리를 가능하게 하여 클라이언트 코드와 객체 생성 로직 사이의 결합도를 낮출 수 있다.
 *
 * 유연성과 확장성 : 팩토리 메소드 패턴은 객체 생성을 추상화하여 여러 종류의 객체를 생성할 수 있도록 한다.
 * 새로운 제품을 추가하거나 기존 제품을 변경하기 위해선 새로운 서브 클래스를 만들고 팩토리 메소드를 구현함으로써 확장이 가능.
 *
 * 다형성의 활용 : 팩토리 메소드를 통해 생성된 객체에 대해 추상화된 인터페이스나 추상 클래스를 통해 접근할 수 있습니다.
 * 클라이언트 코드가 구체적인 객체 클래스에 의존하지 않고, 객체의 공통 동작에만 의존할 수 있도록 한다.
 *
 * 단일 책임 원칙 : Creator 클래스는 객체 생성에 대한 책임을 갖고, ConcreteProduct 클래스는 객체의 동작에 대한 책임을 갖는다.
 */

public class Main {

    public static void main(String[] args) {
        JindoCreator jindo = new JindoCreator();
        jindo.name();

        System.out.println("==============================");

        SapsareeCreator sapsaree = new SapsareeCreator();
        sapsaree.name();
    }
}
