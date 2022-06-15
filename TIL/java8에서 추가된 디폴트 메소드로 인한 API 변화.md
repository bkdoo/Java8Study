## java8에서 추가된 디폴트 메소드로 인한 API 변화
### Iterable의 디폴트 메소드
- forEach()
  - 순회하는 메소드
- spliterator()
  - iterator에 split 기능을 추가함
  - stream 기능의 기반
### Collection의 디폴트 메소드
- stream()/parallelStream()
  - Stream.md 참조
- removeif(Predicate)
  - 조건에 맞는 것을 제거
### Comparator의 디폴트 및 스태틱 메소드
- reversed()
  - 역순 정렬 기능 
- thenComparing()
  - 정렬 이후 추가로 정렬하기 위할 때 사용
- static reverseOrder() / naturalOrder()
- static nullsFirst() / nullsLast()
- static comparing()
### 디폴트 메소드로 인한 간결해진 API설계
- 인터페이스에서 디폴트 메소드를 생성하게 됨으로써, 구현체에서 인터페이스의 모든 메소드를 구현하지 않아도 됨
- java8 이전에는 편의성을 위해 인터페이스 하위에 추상클래스를 생성하였으나 상속의 자유도가 떨어짐
- java8에서 부터는 인터페이스에서 디폴트 메소드를 제공함으로써 상속의 제한도 사라지고, 간결한 api 설계가 가능해짐