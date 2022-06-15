package method.java8defaultMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Java8DefaultMethodTest {
    List<String> names = new ArrayList<>();

    public Java8DefaultMethodTest() {
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
    }

    public void forEachTest() {
        names.forEach(System.out::println);
    }

    public void spliteratorTest() {
        System.out.println("spliterator 테스트");
        Spliterator<String> spliterator = names.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("-----------------------");
        while (spliterator1.tryAdvance(System.out::println));
    }

    public void removeIfTest() {
        System.out.println("removeIf 테스트");
        names.removeIf(s -> s.startsWith("A"));
        names.forEach(System.out::println);
    }
}
