package stream.other;

import java.util.Scanner;

public class ScannerTest {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("이름:");
      String name = scanner.nextLine();// 문자열을 읽는 nextLine() 메소드로 이름과 직업 입력 받음
      System.out.println("직업:");
      String job = scanner.nextLine();// 문자열을 읽는 nextLine() 메소드로 이름과 직업 입력 받음
      System.out.println("사번:");
      int num = scanner.nextInt();// int 형을 읽는 nextLine() 메소드로 사번을 입력받음

      System.out.println(name);
      System.out.println(job);
      System.out.println(num);
   }
}
