package chapter06;
import java.util.Scanner;
public class Computergame {

    public static void main(String[] args) {
        int computerNumber = 0;
        Scanner input = new Scanner(System.in);
        int num1 = 0;

        for (int i = 0; i < 10; i++) {
            computerNumber = (int) (Math.random() * 5 + 1);
            System.out.print("1 ~ 5 사이에 있는 숫자중에 컴퓨터가 예측한 숫자를 맞춰주세요!\n");
            System.out.print("정답: ");
            num1 = input.nextInt();
            if (num1 != computerNumber) {
                System.out.print("틀렸습니다!\n");
            }

            else  {
                break;
            }
//else 문은 자바에서 조건식이 들어가지않는다
        }
        System.out.print("정답입니다!");


    }
}
