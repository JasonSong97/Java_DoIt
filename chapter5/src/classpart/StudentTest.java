package classpart;

public class StudentTest {
   public static void main(String[] args) {
   Student studentAhn = new Student();// 1번째 학생 생성
   studentAhn.studentName = "안연수";

   System.out.println(studentAhn.studentName);
   System.out.println(studentAhn.getStudentName());
}
}
