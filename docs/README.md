## 📝 기능목록

### 기능
- 쉼표로 구분한 자동차 각 객체로 생성
- 자동차 전진 또는 멈춤 기능
- 자동차끼리 위치 비교 기능
- 우승자 선정 기능

### 입력
- 경주 할 자동차 이름 입력받기
- 시도할 횟수 입력받기

### 출력
- 실행 결과 출력하기
- 우승자 안내문구 출력하기
- 예외 상황 시 에러 문구 출력하기 
  - 에러 문구는 "[ERROR]"로 시작해야 함

### 예외처리
사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- 경주 할 자동차 이름 입력 시
  - 구분자가 쉼표가 아닌 경우
  - 자동차 이름이 5자 초과인 경우
- 시도할 횟수 입력 시
  - 숫자가 아닌 문자인 경우