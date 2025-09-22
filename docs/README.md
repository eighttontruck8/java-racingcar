== 구현해야하는 기능 목록 ==

1. 자동차 이름 입력 (쉼표로 구분)
   1-1. 이름 나누기
   1-2. 각 이름 검증
2. 시도할 횟수 입력
   2-1. 횟수 검증 (5회 이하)

3. 각 라운드 진행
   3-1. 각 라운드 별 결과 작성 (이름 : 순위)

4. 최종 우승자 출력 (2명 이상일 수 있음)


유의사항
- 사용자 입력값은 camp.nextstep.edu.missionutils.Console의 readLine() 활용
- Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange() 활용
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현
- 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 구현
- JUnit 5와 AssertJ를 이용하여 본인이 정리한 기능 목록이 정상 동작함을 테스트 코드로 확인할 것!