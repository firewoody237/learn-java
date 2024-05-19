# Java Learn

> 공부 리스트
> 1. 인프런의 김영한 - 자바 Basic(`src/basic`)

## Basic
#### Class
- `WhyClassNeeds` : 왜 클래스가 필요한지 확인한다.
- `UseClass` - `classUnitUse` : `Student`를 활용하여 `WhyClassNeeds`의 단점을 극복한다.

#### 기본형과 참조형
- 기본형에는 값이 들어있고, 참조형에는 위치가 들어가있다.
- 대원칙 : **자바는 항상 변수의 값을 복사해서 대입한다.** (`VariableCopy`)
- 사용하지 않는 인스턴스는 `GC`가 자동으로 메모리에서 제거한다.

#### 객체지향 프로그래밍
- 절차 지향은 데이터와 해당 데이터에 대한 처리 방식이 분리되어있다.
- 객체 지향은 데이터와 그 데이터에 대한 행동이 하나의 객체안에 포함되어있다.

#### 생성자
- `this`는 자기 자신에 대한 참조를 가리킨다. (구분할 수 있으면 생략해도 된다)
- 과거에는 구분하기 위해 항상 `this`를 사용했는데, 현재는 IDE의 발전으로 그런 **코딩 스타일**은 잘 쓰지 않는다. 
- 생성자는 필수로 호출하지 않으면 컴파일 오류가 발생하므로, 작성을 **강제**하는 것에 중요한 의미를 둔다.
- `this()`를 통한 생성자 호출은 항상 첫 번째 문장에 작성해야 한다.

#### 패키지
- 개념적으로 클래스들을 분류한다.
- 패키지명은 모두 소문자로 한다.
- 일반적으로 회사 도메인의 이름을 거꾸로 사용한다.
- `a`, `a.b`는 완전히 다른 패키지이다.

#### 접근 제어자
- 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.
- `private` : 외부 호출 불가
- `default` : 같은 패키지 내에서만 허용
- `protected`; : 같은 패키지 안에서 호출 허용 / 다른 패키지는 상속 관계만 허용
- `public` : 모든 외부 호출 허용
- class
  - `public class`는 반드시 파일명과 이름이 같아야 한다.
  - `default class`는 클래스 내에 여러개 있어도 괜찮다.
- 캡슐화
  - 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.
  - 필요한 기능만 외부에 노출시켜야 한다.

#### 자바 메모리 구조와 static
- 메모리 구조
  - **메서드 영역** : 프로그램을 실행하는 데 필요한 공통 데이터를 관리
    - 클래스 실행 코드 등의 **클래스 정보**
    - static 변수들을 보관하는 **static 영역**
    - 프로그램에 필요한 공통 리터럴 상수를 보관하는 **런타임 상수 풀**
  - **스택 영역** : 실제 프로그램이 실행되는 영역
    - 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 저장한다.
    - 스레드당 1개씩 생성
  - **힙 영역**
    - 객체 인스턴스와 배열이 생성되는 영역
    - 메서드 2개가 공통의 인스턴스를 사용할 때, 힙 영역에 생성된 인스턴스를 사용하게 된다.
    - GC이 이루어지는 주요 영역
  - 객체가 생성될 때 인스턴스의 속성은 인스턴스별로 저장이 되지만, 메서드는 인스턴스마다 똑같기 때문에 메서드 영역에 공통으로 두어 사용한다.
- static 변수
  - `static`이 붙은 멤버 변수는 **메서드 영역**에서 관리
  - 그렇기에 정적 변수에 접근하려면 `ClassName.var`처럼 접근해야 한다.
  - 클래스가 JVM에 로딩되는 순간 생성 되고, JVM이 종료될 때까지가 생명주기이다.
  - 정적변수도 인스턴스 변수에 접근하는 것처럼 사용 가능하나, 쓰지 않는다.
- static 메서드
  - 스태틱 메서드는 `static`이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
  - 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.

#### final
- `static final`은 상수이다.
- `final`로 값이 변하지 않을 때 모든 변수가 동일한 값을 나타낸다면 메모리 낭비이므로, `static fianl`로 사용하는 것도 좋은 방법이다.
- `final`이여도 내부의 값은 변경이 가능하다.
