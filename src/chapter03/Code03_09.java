package chapter03;

public class Code03_09 {
    public static void main(String[] args) {
        int total = 0;

        total -= 900 * 10;
        total += 1800 * 2;
        total -=  3500 * 5;
        total +=  4000 * 4;
        total +=  1500 * 1;
        total +=  2000 * 4;
        total +=  1800 * 5;

        System.out.println("Java 편의점의 일일 매출액 : " + total + "원");
    }
}
