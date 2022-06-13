## java에서 기본으로 제공하는 함수형 인터페이스
- java.util.function 패키지
- Function<T,R>
    + T 타입을 입력 받아 R 타입을 리턴하는 인터페이스
    + 구현 메소드 - apply
        * 예제 : Plus10.java
        * 람다 표현식을 통해 바로 구현 가능
    + 조합용 메소드 1 - compose
        * A.compose(B)
        * B를 먼저 실행 후 A를 실행
    + 조합용 메소드 2 - andThen
        * A.andThen(B)
        * A를 먼저 실행 후 B를 실행
- BiFunction<T,U,R>
    + 입력 값을 2개(T type, U type) 받고 R 타입을 리턴하는 인터페이스
    + 구현 메소드 - apply
- Consumer<T>
    + T 타입을 입력 받아 아무 값도 리턴 하지 않는 인터페이스
    + 구현 메소드 - accept
- Supplier<T>
    + 입력을 받지 한고 T 타입을 리턴하는 인터페이스
    + 구현 메소드 - get
- Predicate<T>
    + T 타입을 입력 받아서 boolean을 리턴하는 인터페이스
    + 구현 메소드 - test
    + 조합용 메소드 - and, or, negate
- UnaryOperator<T>
    + Function<T,R>의 특수 형태로 입력값 하나를 받아서 동일한 타입을 리턴하는 인터페이스
    + Function을 상속 받은 인터페이스
- BinaryOperator<T>
    + BiFunction<T,U,R>의 특수 형태로 동일한 타입의 입력값 두개를 받아서 동일한 타입을 리턴하는 인터페이스
    + BiFunction을 상속 받은 인터페이스

