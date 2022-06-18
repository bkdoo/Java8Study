## Optional
### 객체를 감싸는 컨테이너
- 내부에 값이 한개 혹은 존재하지 않는다.
- 클라이언트에게 명시적으로 null 일 수도 있다고 알려줄 수 있음
- 빈 값인 경우에 대한 처리를 강제함
### 주의점
- 리턴 값으로만 쓰기를 권장함
  - 파라미터 타입, 키 타입, 인스턴스 타입으로 쓰지 말 것
  - 문법적으로 불가능 한 것은 아니나, 허점이 발생하며, null이 발생하기도 함
- Optional을 리턴하는 메소드에서 null을 리턴하지 말 것
- 프리미티브 타입용 Optional은 따로 존재 (OptionalInt, OptionalLong 등)
- Collection, Map, Stream Array, Optional 은 Optional 로 감싸지 말 것
### Optional API
- Optional 만들기
  - Optional.of() 
  - Optional.ofNullable() 
  - Optional.empty()
- Optional에 값이 존재하는지 확인
  - Optional.isPresent() 
  - Optional.isEmpty() > java 11부터 제공
- Optional에 있는 값 불러오기
  - Optional.get()
  - 만약 null 일 경우 런타임에러 발생
  - .ifPresent(), .orElse(), .orElseGet(), .orElseThrow() 사용
- Optional에 값이 존재하는 경우 ~~를 리턴해라
  - Optional.ifPresent(Consumer)
  - 예제 : OptionalTest.java
- Optional에서 값을 가져오고 없는 경우 ~~를 해라
  - Optional.orElse()
  - 값이 존재하는 경우에도 ()내부 로직은 한번 돌아감
  - Optional.orElseGet()
  - 값이 존재하는 경우에는 ()내부 로직을 돌지 않음
- Optional에서 값을 가져오고 없는 경우 에러를 리턴해라
  - Optional.orElseThrow()
- Optional 내부 값 필터링
  - Optional.filter()
- Optional에 들어있는 값 변환
  - Optional.map()
  - Optional.flatMap() > Optional 내부 값이 Optional인 경우에 유용