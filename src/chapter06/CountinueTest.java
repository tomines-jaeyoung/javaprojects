package chapter06;

public class CountinueTest {

    public static void main(String[] args) {
        int sum =0;

    for(int i=1;i<=100;i++) {
        if(i%5 == 0){
            continue;
        }
        sum += i;
    }
        System.out.println("~1부터 100까지의 합계(5의배수 제외) : " + sum);




    }






}

