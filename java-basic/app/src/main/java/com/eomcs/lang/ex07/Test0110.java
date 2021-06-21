package com.eomcs.lang.ex07;

import java.util.Scanner;

//# 메서드 : 사용 전
//
public class Test0110 {


  static void printSpaces(int len) {
    for (int count=0; count<len; count++) {
      System.out.print(" ");
    }
  }


  static void printStars(int len) {
    for (int count=0; count<len; count++) {
      System.out.print("*");
    }
  }

  public static int getSpacelength (int totalStar, int displayStar) {
    return (totalStar - displayStar)/2;

  }


  static int len () {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("밑변의 길이?");
    int len = keyScan.nextInt();
    keyScan.close();
    return len;
  }



  public static void main(String[] args) {
    int len = len();


    for (int starLen=1; starLen <= len; starLen+=2) {

      printSpaces(getSpacelength(len,starLen));
      printStars(starLen);
      System.out.println();

    }



  }
}
