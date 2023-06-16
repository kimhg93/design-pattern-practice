package com.practice.design_pattern.builder;

/**
 *
 * 선택적 매개변수를 갖거나 불변객체를 생성할 때, 비교적 복잡한 객체를 생성 할 때 사용
 *
 * 가독성: 객체 생성 과정이 체인 형태로 연결되기 때문에, 코드가 자연스럽고 읽기 쉽게 구성된다. 각 메서드 호출은 객체 생성 과정의 단계를 명확하게 보여준다.
 * 선택적 매개변수: 필요한 매개변수만 설정할 수 있으며, 나머지 매개변수는 기본값으로 설정된다. 이를 통해 객체 생성 시에 선택적인 매개변수를 처리할 수 있다.
 * 불변성: 빌더 패턴을 사용하면 불변 객체를 생성할 수 있습니다. 생성자에서 필드를 초기화하고 해당 필드들의 Setter 메서드가 없기 때문에, 생성된 객체의 상태를 변경할 수 없다.
 * 확장성: 필요한 경우, 빌더 클래스에 새로운 메서드를 추가하여 객체 생성 과정을 확장할 수 있다. 빌더 클래스에 유효성 검사를 수행하는 메서드를 추가할 수 있다.
 * Thread-safe: 각 스레드는 독립적인 빌더 객체를 사용하여 객체를 생성할 수 있다..
 *
 */
public class Main {

    public static void main(String[] args) {
        DogBuilder jindo = new DogBuilder()
                .type("진돗개")
                .name("백구")
                .gender("숫놈")
                .age(5)
                .weight(15);

        System.out.println(jindo.toString());

        DogBuilder sapsaree = new DogBuilder()
                .type("삽살개")
                .gender("암놈")
                .age(0)
                .weight(1);

        System.out.println(sapsaree.toString());
    }

}
