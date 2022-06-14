package lambda.referenceMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaReferenceMethod {
    public static void main(String[] args) {

        // 스태틱 메소드
        UnaryOperator<String> sample1 = SampleClass::hi;
        System.out.println(sample1.apply("스태틱 메소드"));

        // 특정 클래스의 인스턴스 메소드
        SampleClass sampleClass = new SampleClass();
        UnaryOperator<String> sample2 = sampleClass::hello;
        System.out.println(sample2.apply("특정 클래스의 인스턴스 메소드"));

        // 생성자 (입력x)
        Supplier<SampleClass> sample3 = SampleClass::new;
        System.out.println(sample3.get().getSample());

        // 생성자 (입력o)
        Function<String, SampleClass> sample4 = SampleClass::new;
        System.out.println(sample4.apply("생성자").getSample());

        // 임의 클래스의 인스턴스 메소드
        String[] list = {"dive", "joy", "surf"};
        Arrays.sort(list, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(list));

    }
}
