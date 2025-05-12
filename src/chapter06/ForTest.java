package chapter06;
import java.util.ArrayList;
public class ForTest
{
    public static void main(String[] args)
    {
        String[] names ={"김나현", "김예진", "김재영", "김지혁", "김해민", "김호석", "도경진"};
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i =0; i < names.length; i++)
        {
            System.out.println("서울 정수 캠퍼스 인공지능 소프트웨어학과");
        arrayList.add(names[i]);
        }


        for(String name:arrayList)
        {
            System.out.println(name);
        }
    }







}
