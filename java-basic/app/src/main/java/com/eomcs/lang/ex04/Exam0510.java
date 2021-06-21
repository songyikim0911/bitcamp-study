package com.eomcs.lang.ex04;

//# 배열 - 배열을 선언하는 방법 
// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 방법
//
// - 문법
//        메모리종류[] 메모리이름 = new 메모리종류[개수]
//        데이터타입[] 변수명 = new 데이터타입[개수];
//        ex) int[] arr = new int[5];
//
// - C언어 스타일 
//        데이터타입 변수명[] = new 데이터타입[개수];
//        ex) int arr[] = new int[5];
//
// 배열의 개수는 int 타입의 최대 값과 같다.
// 즉 2147483647 개 이다. 
//
public class Exam0510 {
  public static void main(String[] args) {
    // 배열 사용 전
    int i1, i2, i3, i4, i5;

    // 배열 선언
    int[] arr1 = new int[5]; // OK!
    int arr2[] = new int[5]; // OK! C-style.

    // 배열의 크기는 int 타입의 최대 값이다.
    //배열의 최대 크기 = Integer.MAX_VALUE -2
    //배열은 LONG 크기 불가능! 최대가 INT 값!!!

   // int[] arr3 = new int[2147483647];//실행 오류 ->VM의 배열 크기 제한을 초과
   //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
 int[] arr3= new int[2147483645];
 //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
  //단, 자바 힙 메모리가 부족하다는 실행 오류가 발생할 수 있다.
  //JVM이 OS로부터 사용 허가를 받은 메모리 크기를 벗어났기 때문에 발생한 것이다.
//new int[1]=4byte, new int[10]=40byte,new int[100]=400byte,new int[1000]=4,000byte
  //해결책? 
  //jvm을 실행할때 힙(heap) 메모리의 초기 크기를 늘려라.
  //jvm실행 옵션에 다음을 추가하라
  //-Xms 메모리 크기
//예) $java -Xmx10g ...(10g까지 허용하겠다는 의미)


  }
}


