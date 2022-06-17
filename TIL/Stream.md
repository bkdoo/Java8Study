## Stream api
### Stream
- 데이터를 담고 있는 저장소(Collection)이 아니다
- 스트림이 처리하는 데이터의 원본을 변경하지 않는다.
- 스트림으로 처리하는 데이터는 오직 한번만 처리한다.
- 무제한 일 수 있으며, short circuit 메소드를 이용하요 제한할 수도 있다.
- 손쉽게 병렬처리도 가능하다. (parallelStream)
### 스트림 파이프라인
- 0 ~ n 개의 중개 오퍼레이션과 한개의 종료 오퍼레이션으로 구성한다.
- 종료 오퍼레이션이 작동해야 데이터 처리가 완성된다.
### 중개 오퍼레이션
- Stream을 리턴한다.
- filter(), map(), generate(), skip(), limit() 등
### 종료 오퍼레이션
- anyMatch(), allMatch(), nonMatch() > boolean 리턴
- count(), reduce(), collect(), sum(), max() 등
- 예졔 : stream package