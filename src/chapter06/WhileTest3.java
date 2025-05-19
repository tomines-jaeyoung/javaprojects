package chapter06;
import java.util.Scanner;
public class WhileTest3 {

    public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        int num1=0, num2 = 0;
        int sum =0;

        while(true) {
            System.out.println("프로그램 종료를 원하면 0을 입력해주세요");
            
            System.out.print("숫자1 ==> ");
       num1 = s1.nextInt();
            if(num1 == 0)
            {break;}
            System.out.print("숫자2 ==> ");
            num2 = s1.nextInt();

sum = num2 + num1;
            System.out.printf("%d + %d = %d\n", num1, num2, sum);

        }
System.out.println("프로그램 종료");
    }












}
