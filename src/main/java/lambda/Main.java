package lambda;

import lambda.functionalInterface.Plus10;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class 라 불리었다.
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("hello");
//            }
//        };
        // 람다 형태로 변환 가능 (한줄)
        // 함수형 인터페이스를 인라인으로 표현한 오브젝트
        RunSomething runSomething = () -> System.out.println("hello");
        runSomething.doIt();
        // 람다 형태 (두 줄 이상)
        RunSomething runSomething2 = () -> {
            System.out.println("hello2");
            System.out.println("lambda");
        };
        runSomething2.doIt();

        // Function 구현
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        // Function lambda 식으로 구현
        System.out.println("Function lambda 식으로 구현");
        Function<Integer, Integer> plus5 = (i) -> i + 5;
        Function<Integer, Integer> multi2 = i -> i * 2;
        System.out.println(plus5.apply(5));

        // compose 메소드를 활용한 복합 방식
        System.out.println("compose 메소드를 활용한 복합 방식");
        System.out.println(plus5.compose(multi2).apply(2));;

        // Predicate 실습
        System.out.println("Predicate 실습");
        Predicate<String> isLength3 = s -> s.length()==3;
        Predicate<String> isLength2 = s -> s.length()==2;
        System.out.println(isLength3.test("wow"));
        System.out.println(isLength3.test("byeon"));
        System.out.println(isLength3.and(isLength2).test("wow"));
        System.out.println(isLength3.or(isLength2).test("wow"));
        System.out.println(isLength3.negate().or(isLength2).test("wow"));

    }
}
