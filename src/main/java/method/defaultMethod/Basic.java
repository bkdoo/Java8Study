package method.defaultMethod;

public interface Basic {

    void printName();

    /**
     * @implSpec String 문구를 출력하는 메소드 입니다.
     */
    default void printDefault() {
        System.out.println("인터페이스에서 구현한 메소드입니다.");
    }

    static void printStatic() {
        System.out.println("인터페이스의 스태틱 메소드에서 출력합니다.");
    }
}
