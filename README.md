**📚 구현할 기능 목록들**

**프로그램 실행**

- 로또를 실행할 메서드 구현

**입출력**

- 입력
  - 로또 구입 금액 입력 받기 기능 구현
    - 구입 금액은 1000의 배수인지 유효성 검증 기능 구현
    - 구입 금액의 타입과 범위 유효성 검증 기능 구현
    - 구입 금액이 0보다 큰 양수인지 유효성 검증 기능 구현
    - 구입 금액의 맨 앞이 0으로 시작하는지 유효성 검증 기능 구현
    - 구입 금액에 공백이 존재하는지 유효성 검증 기능 구현
  - 당첨 번호 입력 받기 기능 구현
    - 당첨 번호에 공백이 존재하는지 유효성 검증 기능 구현
    - 입력값에 숫자와 콤마(,) 외의 문자가 들어있는지 유효성 검증 기능 구현
    - 입력값이 빈 문자열이거나 null값인지 유효성 검증 기능 구현
    - 당첨 번호 개수가 6개인지 유효성 검증 기능 구현
    - 당첨 번호가 1부터 45 사이의 숫자인지 유효성 검증 기능 구현
    - 당첨 번호가 중복되는지 유효성 검증 기능 구현
  - 보너스 번호 입력 받기 기능 구현
    - 보너스 번호에 공백이 존재하는지 유효성 검증 기능 구현
    - 보너스 번호가 입력된 당첨 번호와 중복되는지 유효성 검증 기능 구현
    - 보너스 번호가 1부터 45 사이의 숫자인지 유효성 검증 기능 구현
- 출력
  - 발행한 로또 수량 출력 기능 구현
  - 발행한 로또 번호 출력 기능 구현 (번호는 오름차순으로 정렬)
  - 당첨 내역 출력 기능 구현
  - 수익률 출력 기능 구현 (소수점 둘째 자리 반올림)

**도메인**

- 로또 최종 결과를 반환하는 기능 구현
- 입력한 금액만큼 로또 수량 계산하는 기능 구현
- 구매한 수량만큼 로또 번호 생성하는 기능 구현
- 입력 받은 번호를 쉼표(,)를 기준으로 자르는 기능 구현
- 입력 받은 (당첨 번호와 보너스 번호)를 생성한 로또 번호와 비교하여 몇 개 일치하는지 파악하는 기능 구현
- 수익률 계산하는 기능 구현
- 당첨 번호와 생성된 번호를 비교해서 당첨된 횟수를 저장하는 기능 구현
- 각 로또 티켓마다 당첨금 누적하는 기능 구현

**📝구현 기능들 점검 리스트**

**프로그램 실행**

- [X]  로또를 실행할 메서드 구현

**입출력**

- 입력
  - [X]  로또 구입 금액 입력 받기 기능 구현
    - [X]  구입 금액은 1000의 배수인지 유효성 검증 기능 구현
    - [X]  구입 금액의 타입과 범위 유효성 검증 기능 구현
    - [X]  구입 금액이 0보다 큰 양수인지 유효성 검증 기능 구현
    - [X]  구입 금액의 맨 앞이 0으로 시작하는지 유효성 검증 기능 구현
    - [X]  구입 금액에 공백이 존재하는지 유효성 검증 기능 구현
      - [X]  예외 발생할 경우 IllegalArgumentException을 발생, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 받기 기능 
  - [X]  당첨 번호 입력 받기 기능 구현
    - [X]  당첨 번호에 공백이 존재하는지 유효성 검증 기능 구현
    - [X]  입력값에 숫자와 콤마(,) 외의 문자가 들어있는지 유효성 검증 기능 구현
    - [X]  입력값이 빈 문자열이거나 null값인지 유효성 검증 기능 구현
    - [X]  당첨 번호 개수가 6개인지 유효성 검증 기능 구현
    - [X]  당첨 번호가 1부터 45 사이의 숫자인지 유효성 검증 기능 구현
    - [X]  당첨 번호가 중복되는지 유효성 검증 기능 구현
      - [X]  예외 발생할 경우 IllegalArgumentException을 발생, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 받기 기능
  - [X]  보너스 번호 입력 받기 기능 구현
    - [ ]  보너스 번호에 공백이 존재하는지 유효성 검증 기능 구현
    - [ ]  보너스 번호가 입력된 당첨 번호와 중복되는지 유효성 검증 기능 구현
    - [ ]  보너스 번호가 1부터 45 사이의 숫자인지 유효성 검증 기능 구현
      - [ ]  예외 발생할 경우 IllegalArgumentException을 발생, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 받기 기능
- 출력
  - [X]  발행한 로또 수량 출력 기능 구현
  - [X]  발행한 로또 번호 출력 기능 구현 (번호는 오름차순으로 정렬)
  - [ ]  당첨 내역 출력 기능 구현
  - [ ]  수익률 출력 기능 구현 (소수점 둘째 자리 반올림)

**도메인**

- [ ]  로또 최종 결과를 반환하는 기능 구현
- [X]  입력한 금액만큼 로또 수량 계산하는 기능 구현
- [X]  구매한 수량만큼 로또 번호 생성하는 기능 구현
- [X]  입력 받은 번호를 쉼표(,)를 기준으로 자르는 기능 구현
- [ ]  입력 받은 (당첨 번호와 보너스 번호)를 생성한 로또 번호와 비교하여 몇 개 일치하는지 파악하는 기능 구현
- [ ]  수익률 계산하는 기능 구현
- [ ]  당첨 번호와 생성된 번호를 비교해서 당첨된 횟수를 저장하는 기능 구현
- [ ]  각 로또 티켓마다 당첨금 누적하는 기능 구현