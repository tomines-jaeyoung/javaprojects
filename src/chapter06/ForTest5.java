package chapter06;

public class ForTest5 {

    public static void main(String[] args) {
int n = 1000;
        int sum=0;
        String oddEven = "짝수";
        for(int i =500; i<=n; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;

            }
        }
        System.out.println("500 ~ " + n + " 까지의 "+oddEven+ " 합계는 " + sum + " 입니다");

    }
}
