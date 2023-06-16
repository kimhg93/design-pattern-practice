package com.practice.design_pattern.facade;

/**
 *
 * 복잡한 서브시스템을 단순한 인터페이스로 제공 하도록 단일 클래스로 감싼다.
 * 시스템이 복잡한 경우 서브시스템과 사용자의 상호작용을 단순화 하고 서브시스템 내부 구조를 숨길 수 있다.
 * 단순한 인터페이스를 제공하기 위해 설계되었지만, 서브시스템의 모든 기능을 하나의 클래스에 집어넣는 것은 좋은 설계 방법이 아니다.
 * 서브시스템의 내부 동작을 감추는 역할을 수행하므로, 서브시스템을 확장하거나 변경할 때 주의해야 한다.
 *
 * 결합도 감소: 클라이언트는 Facade 인터페이스만 알면 되므로, 서브시스템의 변경에 영향을 받지 않는다
 *  서브시스템의 내부 구조를 캡슐화한다. 클라이언트는 복잡한 서브시스템의 구조를 알 필요가 없으며, 단순한 인터페이스만 사용하면 된다.
 * 코드의 가독성과 유지보수성을 향상. Facade 클래스는 복잡한 로직을 단순화하여 클라이언트 코드를 깔끔하게 유지할 수 있도록 도와준다.
 *
 */

public class Main {

    public static void main(String[] args) {
        Sapsaree sapsaree = new Sapsaree("삽살개");
        Jindo jindo = new Jindo("진돗개");

        JindoSapsareeFacade facade = new JindoSapsareeFacade(sapsaree, jindo);
        facade.performActions();
    }
}
