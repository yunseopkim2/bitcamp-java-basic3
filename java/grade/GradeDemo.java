package grade;

import java.util.Scanner;

/**
 * packageName: grade
 * fileName   : GradeDemo
 * author     : kimyunseop
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-26   yunseopkim        최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);




       /* System.out.println("이름: ");
         String name = scanner.next();
        System.out.println("국어: ");
        int kor = scanner.nextInt();
        System.out.println("영어: ");
         int eng = scanner.nextInt();
        System.out.println("수학: ");
         int math = scanner.nextInt();
        System.out.println("총점: %s", this.pass);
        String res = String.format(" * ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d점 \n" +
                " * > 영어: %d점 \n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점 \n" +
                " * 평균(정수): %d점\n" +
                " * 합격여부: %s\n" +
                " * #######################",
                GradeApp.GRADE_TITLE, name, kor, eng, math, total, avg, pass);
        System.out.println(res);
    }
}
