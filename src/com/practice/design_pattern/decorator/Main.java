package com.practice.design_pattern.decorator;

/**
 *
 * 객체의 기능을 변경하지 않고 확장하거나 추가적인 기능을 적용 해야 할때 사용
 *
 * 개방 폐쇄 원칙: 기존의 코드를 수정하지 않고도 객체의 기능을 확장할 수 있다 *
 * 유연성과 확장성: 동적으로 객체의 기능을 조합할 수 있습니다. 데코레이터를 여러 개 조합하여 다양한 기능의 조합을 생성할 수 있으며, 동작을 변경하지 않고도 새로운 기능을 추가할 수 있다.
 * 단일 책임 원칙: 기능을 추가하는 것과 객체의 핵심 기능을 분리함으로써 단일 책임 원칙을 지킬 수 있다. 코드의 가독성과 유지보수성 향상.
 *
 * 데코레이터 패턴은 객체를 감싸는 구조를 생성하고, 객체 간의 연결을 유지해야 한다. 이로 인해 코드의 복잡성이 증가할 수 있으며, 클래스의 수가 많아질 수 있고
 * 감싸는 구조로 인해 약간의 오버헤드가 발생할 수 있으며, 성능에 영향을 줄 수 있다. 여러 겹으로 중첩하여 사용하는 경우 객체의 타입을 파악하기 어려울 수 있다.
 *
 */

public class Main {

    public static void main(String[] args) {
        DogComponent jindo = new Jindo();

        DogComponent redJindo = new JindoDecoratorRed(jindo);
        redJindo.action();

        System.out.println("========================");

        DogComponent blueJindo = new JindoDecoratorBlue(jindo);
        blueJindo.action();
    }
}
