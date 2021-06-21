package com.eomcs.lang.ex07;



public class TestByMyself {

  public static void main(String[] args) {
    //메인에 호출하기~
    hello();//1번메서드
    //리턴값이 없어서 변수를 책정할수가없는듯... 왜냐고? 리턴값은 특정 데이터 타입이 있으니
    //그 리턴값을 변수에 넣는거거든 리턴값있는애들은 그래...
    //hello h1 = hello(); 얘는 오류난다.


    hello2("안녕", 8282);//2번메서드
    //마찬가지...리턴값이 없어서 변수를 책정할수가없네?ㅎㅎ
    //hello2 h2 = hello(); 얘도 리턴값없어서 오류난다.


    hello3();//3번 메서드
    String he3 = hello3(); //String변수에 hello3의 리턴값을넣는거임. 왜냐 hello3의리턴값을
    //string이라고 지정해놨거든
    System.out.println(he3);


    hello4("메써드4",42); //4번 메서드
    String he4 = hello4("메써드4444", 222);//string변수에 hello4의 리턴값을 넣는것임
    //왜냐 hello4의 리턴값이 스트링이라고 지정되있거든~



    hello4_1(); //4-1 메서드
    hello4_1("4-1");
    System.out.println("----");
    hello4_1("4-1-1","4-1-2","4-1-3");

    String[] arr4 = {"A", "B", "C"};//4-1에 arr 넣기
    hello4_1(arr4);

    int result = plus(plus(plus (2,3),4),5);
    System.out.println(result);
    int a = plus(3,5);


    MyObject ref = new MyObject(); //MyObject는 클래스 이름임.. 
    ref.a = 100;
    ref.b = 200;
    swap(ref);
    System.out.println(ref.a);
    System.out.println(ref.b);

  }
  //저 안안에 변수선언이 파라미터 선언임
  //리턴값의 타입? 함수 블록에 들어있는
  //명령어를 수행 완료한 후 그 결과로 놓이는 값의 타입
  //메서드 사용방법
  //리턴 값을 받을 변수 = 메서드명(아규먼트);
  //메서드 문법 종류


  //1번타입 값x결과x
  //void 메서드명() {문장}
  static void hello() {
    System.out.println("1번 메서드, 어떤값도 리턴하지 않는다.");
  }

  //2번타입 값 o결과x
  //void 메서드명(변수선언 1, 2,,){문장}
  static void hello2(String name, int age) {
    System.out.println("2번 메서드,값은반환하지않는다.");
    System.out.println("2번, 단, 값을 받긴한다");
    System.out.printf("2번,string은 %s 요기에받고, int는 %d 요기에 받는다", name, age);
    System.out.println();
  }


  //3번타입 값x 결과o
  //리턴타입 메서드명(){문장}

  static String hello3() {
    System.out.println("3번,Syso");
    return "3번 리턴값.";

  }


  //4번타입 값 o 결과o
  //리턴타입 메서드명(변수선언1, 2,,,){문장}

  static String hello4(String name, int age) {
    String retVal = String.format("4번, %d살 %s 님을 환영.", age , name);
    System.out.println(retVal);
    return retVal;

  }
  //가변 파라미터
  //[리턴타입] 메서드명 (타입...변수) {...}
  static void hello4_1(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다. \n", names[i]);
    }
  }
  //5번 배열 파라미터
  static void hello5(String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  static int plus (int a, int b) {
    return a+b;
  }

  //1,2번 -->void-->리턴값없음.
  //3,4번-->리턴 -->리턴값있음
  //2번,4번-->변수선언-->값을 넘겨줌.
  //메서드 종류
  //클래스 메서드 (static이 붙어있음)
  //클래스에 소속되어 있음, 모든 인스턴스가 공유
  //인스턴스 메서드(static이 없음)
  //특정 인스턴스에 대해 사용한다.

  static class MyObject{
    int a;
    int b;
  }

  static void swap(MyObject ref) {
    System.out.print(ref.a);
    System.out.println(ref.b);
    int temp = ref.a;
    ref.a=ref.b;
    ref.b=temp;
    System.out.print(ref.a);
    System.out.println(ref.b);
  }

}






