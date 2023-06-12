package com.practice.design_pattern.observer;

/**
 * 객체 간의 상태변화, 이벤트 처리 시스템, MVC 등 객체의 상태변화에 따른 동적 처리가 필요할 경우 사용
 *
 * 느슨한 결합: 주체(Subject)와 옵저버(Observer) 사이의 의존성을 낮춘다. 주체 객체는 옵저버에 대한 정보를 가지지만, 옵저버 객체들은 주채 객체에 대한 정보를 가지지 않는다.
 * 이로 인해 객체 간의 결합도가 낮아지고, 유연성과 재사용성이 향상됩니다.
 *
 * 확장성: 주체 객체에 옵저버를 등록하면 새로운 옵저버가 알림을 받을 수 있다. 이를 통해 시스템에 새로운 동작을 쉽게 추가하고 확장할 수 있습니다.
 *
 * 일관성: 상태 변화에 따른 업데이트 작업을 일관되게 처리할 수 있다. 여러 옵저버 객체들이 주제 객체의 상태 변경에 대한 알림을 받으면,
 * 각각의 옵저버는 자신에게 필요한 동작을 수행하게 된다. 이를 통해 시스템의 일관성을 유지할 수 있다.
 *
 * 확장된 이벤트 처리: 이벤트 처리 시스템에서 유용하게 활용될 수 있다. 주제 객체에서 발생하는 이벤트를 감지하고, 등록된 옵저버들에게 이벤트를 전달하는 것이 가능하다.
 *
 * 유지보수성: 코드의 유지보수성을 향상시킵니다. 주제 객체와 옵저버 객체 간의 분리된 역할을 통해 각 객체의 독립성을 보장하고, 변경이 필요한 경우 해당 객체만 수정하면 된다.
 */
public class Main {

    public static void main(String[] args) {
        DogNameGenerator nameGenerator = new DogNameGenerator();

        DogNameObserver observer1 = new DogNameObserver(nameGenerator);
        DogNameObserver observer2 = new DogNameObserver(nameGenerator);

        nameGenerator.attach(observer1);
        nameGenerator.attach(observer2);

        nameGenerator.setName("Jindo");

        nameGenerator.detach(observer2);

        nameGenerator.setName("Sapraree");


    }
}
