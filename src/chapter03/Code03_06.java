package chapter03;

import java.util.Scanner;

public class Code03_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double kg, pound;


        System.out.print("파운드(lb)를 입력하세요 :");
         pound = s.nextDouble();
        kg = pound * 0.453592;
        System.out.println(pound + "파운드는" + kg + "킬로그램입니다." );

        System.out.print("킬로그램(kg)을 입력하세요");
         kg = s.nextDouble();
        pound = kg * 2.204623;
        System.out.println( kg + "킬로그램은" + pound + "파운드 입니다.");




s.close();




    }



}
