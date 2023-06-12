package com.practice.design_pattern.iterator;

/**
 * Iterator 패턴은 데이터베이스 결과, 리스트, 트리 등의 다양한 컬렉션 구조를 처리하는 경우에 유용.
 * 컬렉션의 순회 작업을 복잡하게 처리해야 하는 경우나 다른 컬렉션 타입으로의 변경이 예상되는 경우에도 Iterator 패턴을 사용할 수 있다.
 * 이를 통해 코드의 가독성과 유지보수성을 향상시킬 수 있다.
 *
 * 컬렉션의 내부 구조에 대한 접근을 Iterator 객체에 위임하여, 클라이언트 코드가 컬렉션의 내부 구조를 알 필요가 없다.(정보 은닉과 캡슐화)
 * 다양한 순회 방식 지원: 구현에 따라 순차적인, 역순으로, 조건에 따라 건너뛰며 등의 다양한 순회 방식을 지원할 수 있다.
 * 동시 접근 지원: 멀티스레드 환경에서 컬렉션에 안전하게 접근하고, 동시 수정을 방지하는 데 유용
 * 일관된 인터페이스 제공: Iterator 인터페이스의 next()와 hasNext() 메서드는 모든 컬렉션에 대해 일관된 방식으로 요소에 접근할 수 있는 통일된 메서드 호출 방식
 * 반복 작업을 추상화하여 코드의 재사용성과 유지보수성을 향상시킨다. 컬렉션 객체와 반복 작업을 분리함으로써,
 * 코드의 의존성을 낮추고 모듈 간의 결합도를 줄일 수 있다. 이로 인해 다음과 같은 장점을 얻을 수 있다.
 *
 * 단일 책임 원칙 : Iterator 패턴을 사용하면 컬렉션 객체는 요소의 저장 및 관리에 집중할 수 있고, Iterator 객체는 순회 및 접근과 같은 반복 작업에 집중할 수 있다.
 * 코드 재사용성: Iterator 인터페이스를 통해 컬렉션의 순회 방식을 표준화하고 일관성 있게 사용할 수 있다. 객체를 재사용하여 다양한 컬렉션에서 동일한 순회 로직을 적용할 수 있다.
 * 확장성: 새로운 컬렉션 타입을 추가할 때, 해당 컬렉션에 맞는 Iterator 객체를 구현하기만 하면 된다.
 * 순회 작업의 독립성: Iterator 패턴을 사용하면 클라이언트 코드에서 순회 작업에 대한 세부 사항을 알 필요가 없다.
 *
 * java.util.Iterator, java.util.ArrayList
 */

public class Main {

    public static void main(String[] args) {

        DogHouse dogHouse = new DogHouse(3);

        dogHouse.appendDog(new Dog("Jindo"));
        dogHouse.appendDog(new Dog("Sapsaree"));
        dogHouse.appendDog(new Dog("Jabjong"));

        Iterator itr = dogHouse.iterator();

        while(itr.hasNext()){
            Dog dog = (Dog)itr.next();
            System.out.println(dog.getName());
        }

    }
}
