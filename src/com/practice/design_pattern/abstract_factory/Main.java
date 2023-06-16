package com.practice.design_pattern.abstract_factory;

/**
 *
 * 여러가지의 제품군이 있을 경우 이를 묶어 추상화 하고 팩토리에서 집합으로 묶은 제품군을 구현한다.
 * 제품군이 변경이나 확장이 예상될 경우, 제품군의 생성과 사용을 분리하고자 할 때 사용한다.
 *
 * 한 번에 관련된 객체들을 생성할 수 있으므로 일관성 있는 객체 생성을 보장합니다. 객체들이 함께 동작해야 하는 경우 유용하며, 객체들 간의 일관성과 호환성을 유지할 수 있다.
 * 객체의 생성을 팩토리 클래스로 분리하여 클라이언트 코드와 객체 생성 코드를 분리 한다. 클라이언트는 추상 팩토리 인터페이스를 통해 객체를 요청하고,
 * 실제 객체 생성은 구체적인 팩토리 클래스에서 처리한다. 이로써 객체 생성과 사용의 결합도를 낮출 수 있다.
 * 새로운 제품군을 추가하거나 기존 제품군을 변경하기 쉽게 만든다. 새로운 팩토리 클래스를 구현하여 새로운 제품군을 생성할 수 있으며, 기존 코드에는 영향을 주지 않는다.
 * 이는 코드의 확장성과 유연성을 높여줍니다.
 *
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory = new MaleDogFactory();

        Jindo maleJindo = factory.createJindo();
        Sapsaree maleSapsaree = factory.createSapsaree();

        maleJindo.eat();
        maleSapsaree.eat();

        factory = new FemaleDogFactory();

        Jindo femaleJindo = factory.createJindo();
        Sapsaree femaleSapsaree = factory.createSapsaree();

        femaleJindo.eat();
        femaleSapsaree.eat();
    }
}
