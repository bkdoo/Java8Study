package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {
    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring basic class", true));
        springClasses.add(new OnlineClass(2,"spring jpa class", true));
        springClasses.add(new OnlineClass(3,"spring mvc", false));
        springClasses.add(new OnlineClass(4,"spring core", false));
        springClasses.add(new OnlineClass(5,"rest api", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The java, test", true));
        javaClasses.add(new OnlineClass(7, "The java, code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The java, 8 to 11", true));

        List<List<OnlineClass>> events = new ArrayList<>();
        events.add(springClasses);
        events.add(javaClasses);

        System.out.println("spring으로 시작하는 수업");
        springClasses.stream()
                .filter(o -> o.getName().startsWith("spring"))
                .forEach(o -> System.out.println(o.getName()));
        System.out.println("close 되지 않은 수업");
        springClasses.stream()
                .filter(o -> !o.isClosed())
//                .filter(Predicate.not(OnlineClass::isClosed))
                .forEach(o -> System.out.println(o.getName()));
        System.out.println("수업 이름만 모아서 스트림 만들기 ");
        springClasses.stream()
                        .map(OnlineClass::getName).forEach(System.out::println);
        System.out.println("두 수업 목록에 들어있는 모든 아이디 출력");
        events.stream().flatMap(Collection::stream).map(OnlineClass::getName).forEach(System.out::println);
        System.out.println("자바 수업중 test가 들어있는 수업인지 확인");
        javaClasses.stream().anyMatch(c -> c.getName().contains("test"));
        //anyMatch : boolean 리턴하는 종료형
    }
}
