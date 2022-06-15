package method.defaultMethod;

public class OtherImpl implements Basic{
    @Override
    public void printName() {
        System.out.println("두번째 구현체에서 구현하였습니다.");
    }

    @Override
    public void printDefault() {
        System.out.println("인터페이스에서 구현한 메소드를 재정의 하였습니다.");
    }
}
