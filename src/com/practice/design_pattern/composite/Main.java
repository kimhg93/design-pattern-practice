package com.practice.design_pattern.composite;

/**
 *
 * 객체 간의 계층 구조가 존재하거나, 계증 구조에서 일괄처리 작업이 필요한 경우, 객체의 구조를 동적으로 구성해야 할 경우 사용한다.
 * 개별 객체와 그룹을 동일하게 여기기 때문에 묶어서 연산하거나 관리할 때 편리하다. 수평적, 수직적 모든 방향으로 객체를 확장할 수 있다.
 * 하지만 인터페이스를 설계하기 어렵고 계층의 깊이가 깊어질 경우 복잡성이 증가한다.
 *
 * 일관된 인터페이스: 개별 객체와 그룹을 동일한 방식으로 다룰 수 있다. 클라이언트 코드는 개별 객체와 그룹을 구분하지 않고 일관된 인터페이스를 사용할 수 있다.
 * 개별 객체와 그룹을 쉽게 교체하거나 추가할 수 있다.
 * 확장성과 유연성: 객체 구조를 동적으로 구성할 수 있다. 새로운 개별 객체나 그룹을 추가하거나 제거할 수 있으며, 계층 구조를 자유롭게 조작할 수 있다.
 * 일괄 처리 작업: 계층 구조의 모든 객체에 대해 일괄 처리 작업을 수행할 수 있다. 객체를 순회하고 통일된 작업을 수행할 수 있으므로 코드의 중복을 피하고 작업을 간결하게 표현할 수 있다.
 *
 */
public class Main {

    public static void main(String[] args) {
        /*
                             진도 할머니
                _________________|_____________________
               |            |             |            |
            진도숫놈1     진도암놈1      진도숫놈2     진도암놈2
                     _______|_______                   |
                    |               |                  |
               진도새끼암놈1     진도새끼숫놈2       진도새끼숫놈3
         */
        DogComponent rootJindo = new FemaleDog("진도할머니");

        DogComponent maleJindo1 = new MaleDog("  진도 숫놈1");
        DogComponent femaleJindo1 = new FemaleDog("  진도 암놈1");
        DogComponent kidJindo1 = new FemaleDog("    진도 새끼 암놈1");
        DogComponent kidJindo2 = new MaleDog("    진도 새끼 숫놈2");

        DogComponent maleJindo2 = new MaleDog("  진도 숫놈2");
        DogComponent femaleJindo2 = new FemaleDog("  진도 암놈2");
        DogComponent kidJindo3 = new MaleDog("    진도 새끼 숫놈3");

        rootJindo.add(femaleJindo1);
        rootJindo.add(maleJindo1);
        rootJindo.add(femaleJindo2);
        rootJindo.add(maleJindo2);

        femaleJindo1.add(kidJindo1);
        femaleJindo1.add(kidJindo2);
        femaleJindo2.add(kidJindo3);

        rootJindo.action();
    }
}
