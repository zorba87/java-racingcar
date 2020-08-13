# 자동차 경주 게임
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

## 기능 목록
게임은 크게 초기화, 게임 진행 ,결과 계산, 결과 출력 과정으로 이루어진다.

### 초기화
- 이름을 입력받는다.
    - **예외**: 자동차 이름이 5자를 초과한 경우  
    - __예외__: 이름이 콤마 단위로 구분되지 않은 경우
    - __예외__: 이름이 공백이나 null 일경우 
- 시도할 회수를 입력받는다.
    - **예외**: 시도 회수가 숫자가 아닌경우
    
### 게임진행
- 게임이 시작되면 초기화된 정보를 가지고 게임을 시작한다.

- __종료__: 시도 회수가 모두 끝난경우 계산 단계로 넘어간다.

### 결과 계산
- 각 플레이어간 거리를 비교해 승자를 가린다. 

### 결과 출력
- 우승자를 출력한다.

___
## 프로그래밍 요구사항
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.

- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.

- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596

- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
    
