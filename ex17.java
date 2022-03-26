import java.util.*;

public class ex17 
{
    public static void main(String[] args) 
    {
        String [] str={"good", "time", "good", "time", "student"};
        List <String> list = new ArrayList<>(List.of(str));
        Set <String> set = new HashSet<>(list);
        List <String> result = new ArrayList<>(set);
        System.out.println("result : " + result);
        System.out.println("result : " + str);
    }
    
}
//Set은 중복을 허용하지 않는 리스트다.
//일반 리스트는 중복을 허용함.
//자바에서는 처리가 안됨. 
//자바 스크립트는 출력이 되지만, 자바에서는 배열은 인덱스를 지정해주어야 출력된다. 
//리스트는 그냥 출력 가능. 아마, 자바 스크립트에서는 리스트의 느낌으로 자동 전환되서 그런 거 아닐까?!
//솔직히, 아직 개념적으로 많이 부족한 거 같다.



