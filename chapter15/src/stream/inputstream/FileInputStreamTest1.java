package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
   public static void main(String[] args) {
      FileInputStream fis = null;

      try{
         fis = new FileInputStream("input.txt");// input.txt 파일 입력 스트림 생성
         System.out.println(fis.read());
         System.out.println(fis.read());
         System.out.println(fis.read());
      }catch (IOException e){
         System.out.println(e);
      }finally {
         try{
            fis.close();// 열린 스트림은 finally 에서 닫음
         }catch (IOException e){
            System.out.println(e);
         }catch (NullPointerException e){// 스트림이 null 인 경우!
            System.out.println(e);
         }
      }
      System.out.println("end");
   }
}
