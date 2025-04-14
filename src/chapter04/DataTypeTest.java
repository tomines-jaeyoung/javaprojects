package chapter04;

public class DataTypeTest {


    public static void main(String[] args) {
//    숫자가 아닌 자료형 :boolean, char
        boolean boo1 = false;
        boolean boo2 = 100 > 200; //false
        boolean boo3 = !boo1; //true

        char ch1 = 'A';
        char ch2 = 97;
        System.out.println("ch1: " + ch1);
        System.out.println("ch2: " + ch2);
        System.out.println("ch1 + 3 :" + (char)(ch1 + 3));
        //(char)<< 이건 추가한거임 그전이랑 비교, (ch1+3), "ch1 +3" 의 차이.



        // 숫자 자료형 : 정수형, 실수형
        // 정수형 : byte, short, int, long

 // overflow       byte byte1 =128;(에러남)

        byte byte1 = 127;
        byte byte2 = -128;
        //         underflow    byte byte3=-129; (에러남 )

        byte byte4 = byte1;

        System.out.println("byte1: " + byte1);
        System.out.println("byte4: " + byte2);

        short short1 = 128;
        short short2 = byte2;

         //byte byte4 = short1; (범위차이)(에러남)


        int int1 = byte2;
        int int2 = short1;
        int int3 = 1000000000;

        long long1 = byte2;
        long long2 = short1;
        long long3 = int3;
        long long4 = (long)Math.pow(10,15);//
        System.out.println("long4: " + long4);;// math.pow < 싷수값 반환.



        //실수형

        float float1 = 123.456f;
        float float3 = short1;
        float float4 = 100;//(100.3은 대입안됨)
//f를 붙어야됨. 실수형의 기본은 더블형의 값으로 됨. 그래서 뒤에 자료형으로 변환해야됨 > 더블에서 플롯형으로 변환(형변환)

               float float2 = (float)200.123;
//이것도 형변환

        double double1 = 555.456;
        double double2 = float1;
        double double3 = byte2;
        double double4 = long3;
        double double5 = 333;



        System.out.println("double1: " + double1);
// 참조형 : 클래스, 인터페이스

        String str1 = new String("hello");
        str1 = "hello";
        String str2 = new String("hello");
      boolean boll4 = str1 == str2;
      System.out.println("str1 == str2 : " + boll4);
      System.out.println("str1.equals(str2) : " + str1. equals(str2));
            //메소드를 사용 주소값이아닌 문자열값을 비교








    }


}