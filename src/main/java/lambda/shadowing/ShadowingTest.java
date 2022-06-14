package lambda.shadowing;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ShadowingTest {

    public static void main(String[] args) {

        int baseNumber = 10;

        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println("로컬 클래스 테스트");
                System.out.println(baseNumber); // 10 이 출력됨
                int baseNumber = 11;
                System.out.println(baseNumber); // 11 이 출력됨 - Shadowing
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printBaseNumber();

        // 익명 클래스
        IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int baseNumber) {
                System.out.println("익명 클래스 테스트");
                System.out.println(baseNumber);
            }
        };

        intConsumer.accept(12); // 12 가 출력됨 - Shadowing

        // 람다
        IntConsumer intConsumer2 = i -> {  // input 파라미터명을 baseNumber로 설정 불가 (already defined in scope)
            System.out.println("람다 테스트");
            System.out.println(baseNumber);
        };

        intConsumer2.accept(13); // 10이 출력됨

    }


}
