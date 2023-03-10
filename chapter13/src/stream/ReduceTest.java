package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{// BinaryOperator 를 구현한 클래스 정의
   @Override
   public String apply(String s1, String s2){// reduce() 메소드가 호출될 때 불리느 ㄴ메소드, 두 문자열 길이를 비교
      if(s1.getBytes().length >= s2.getBytes().length){
         return s1;
      }else{
         return s2;
      }
   }
}
public class ReduceTest {
   public static void main(String[] args) {
      String[] greeting = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다.^^"};
      System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {// 람다식을 직접 구현하는 방법
         if(s1.getBytes().length >= s2.getBytes().length) return s1; else return s2;}));

      String str = Arrays.stream(greeting).reduce(new CompareString()).get();// BinaryOperator 를 구현한 클래스 사용
      System.out.println(str);
   }
}
