package optional;

import stream.OnlineClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring basic class", true));
        springClasses.add(new OnlineClass(2,"spring jpa class", true));
        springClasses.add(new OnlineClass(5,"rest api", false));
        long count = springClasses.stream().count();
        System.out.println(count);
        Optional<OnlineClass> any = springClasses.stream().filter(sc -> sc.getId()>=1).findAny();
        any.ifPresent(oc -> System.out.println(oc.getId()));
        System.out.println(any.stream().count());

    }
}
