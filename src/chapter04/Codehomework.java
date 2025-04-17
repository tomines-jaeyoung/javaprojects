package chapter04;

import java.util.Scanner;

public class Codehomework
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 학점 수 입력
        System.out.print("Java 과목 학점을 입력하세요 : ");
        int java = sc.nextInt();

        System.out.print("mobile 과목 학점을 입력하세요: ");
        int mobile = sc.nextInt();

        System.out.print("excel 과목 학점을 입력하세요: ");
        int excel = sc.nextInt();

        // 성적 점수 입력
        System.out.print("excel 과목의 성적을 입력하세요 : ");
        double A = sc.nextDouble();

        System.out.print("mobile 과목의 성적을 입력하세요: ");
        double A0 = sc.nextDouble();

        System.out.print("Java 과목의 성적을 입력하세요 : ");
        double B = sc.nextDouble();

        double avg;
        avg = ((java * B) + (mobile * A0) + (excel * A)) / (java + mobile + excel);
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println("평균 학점: " + avg);

        sc.close();
    }
}