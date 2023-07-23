# ⚾️ 숫자 야구 게임

## 게임 방법
> 컴퓨터와 게임 플레이어가 1 ~ 9 까지의 서로 다른 수로 이루어진 3자리의 수를 맞추는 것
> - 컴퓨터는 게임 시작시 랜덤으로 3자리 수를 뽑습니다.
> - 플레이어는 컴퓨터가 뽑은 3개의 숫자를 모두 맞히면 게임이 종료된다.
> - 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
> - 같은 수가 같은 자리에 있으면 스트라이크 / 다른 자리에 있으면 볼 / 전혀 없으면 낫싱.

- player input value
: 원하는 숫자 3자리 수를 한번에 입력합니다.
- computer input value
: 게임 시작시 랜덤으로 검증된 3자리 수가 자동으로 세팅 됩니다.

## 기능 요구 사항
1. 1~9까지의 중복되지 않는 수를 검증할 수 있어야 한다.
2. 스트라이크, 볼, 낫싱이라는 힌트를 보여준다. 
3. 컴퓨터와 플레이어 공의 일치여부를 확인할 수 있어야 한다.
4. 컴퓨터는 플레이어가 입력한 숫자에 대한 결과를 출력한다.
5. 게임을 종료하거나 다시 시작할 수 있는 옵션이 존재해야한다.
6. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨 후 애플리케이션은 종료되어야 한다.
7. 자바 코드 컨벤션을 지키면서 프로그래밍 한다.
8. depth는 2가 넘지 않도록 구현한다.
9. 자바 8에 추가된 stream api를 사용하지 않고 구현해야하며 람다는 사용 가능하다.
10. else 예약어를 쓰지 않는다.

## 구현 내용
1-1) GameStarter main() 함수를 실행하면 게임이 시작됩니다.
이때 컴퓨터 랜덤 번호를 추출하여 리스트에 저장합니다. 
<img width="595" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/af285fe8-4c36-43f3-830a-160897b77eec">

1-2) 잘못된 숫자 입력시 예외가 발생하며 게임은 종료됩니다.
<img width="848" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/3787bba0-065c-42e2-94d2-a710e352809d">

### 발생 상황 콘솔

- 일치하는 공이 없는 경우: nothing
<img width="586" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/f2ec9e3f-860f-47fb-8e44-4ba97a99173f">
- 스트라이크
<img width="570" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/9535bb36-d58c-45e1-b7b2-39bfbe7df9c6">
- 볼
<img width="574" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/61576142-e41f-4d77-b721-901a190ade0a">
- 스트라이크 + 볼
<img width="601" alt="image" src="https://github.com/jangseoyun/baseball-game/assets/94329274/05ee2b75-46da-4338-bb2d-c1987ae0370b">