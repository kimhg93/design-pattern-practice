package com.practice.design_pattern.adapter;

/**
 * 두 클래스 사이에 인터페이스 불일치가 있을 경우 사용
 * Target(사용하려는 대상 "Dog")
 * Adaptee(적용대상, 직접 사용할 수 없는 인터페이스 "Cat")
 * Adaptor(클라이언트가 Target 인터페이스를 통해 Adaptee 와 상호 작용할 수 있도록 변환 작업 수행)
 *          Target 인터페이스를 구현, 내부에 Adaptee 클래스의 인스턴스를 유지.
 *          Adapter 클래스는 클라이언트로부터 호출되면 내부의 Adaptee 인스턴스에게 작업을 위임,
 *          필요에 따라 Adaptee의 결과를 변환하여 클라이언트에게 반환
 *
 *  인터페이스 호환성 : 인터페이스간 요구사항이 일치하지 않는경우 불일치를 해결할 수 있다.
 *  재사용성 및 유연성 : 기존의 클래스나 라이브러리를 수정하지 않고도 새로운 인터페이스를 제공할 수 있음
 *  결합도 감소 : 기존 클래스와 직접적으로 상호작용하지 않고, 인터페이스를 통해 간접적으로 상호작용
 *  대체 가능성 : 어댑터를 변경하여 기존 코드를 수정하지 않고도 새로운 클래스나 라이브러리를 사용할 수 있음
 */

public class Main {

    public static void main(String[] args) {
        // 고양이 개 변환
	    Dog dog = new AdaptorCatToDog(new Cat());
	    dog.eatSomething();
	    dog.runFromHouse();
    }
}
