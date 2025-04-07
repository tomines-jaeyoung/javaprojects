package chapter03;
import java.util.Scanner;
public class Code03_07 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double kg, cm, result;


        System.out.print("체중(kg)을 입력하세요 :");
        kg = s.nextDouble();


        System.out.print("키(cm)를 입력하세요 :");
        cm = s.nextDouble();


        result = kg / Math. pow(cm/100, 2);

        System.out.println("당신은 체중" + kg + "kg" + " 키" + cm + "cm 이므로 BMI 지수가" + result + "입니다" );


        s.close();




    }
}
