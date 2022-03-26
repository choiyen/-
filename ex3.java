import java.util.Scanner;

public class ex3 {
    
    public static void main(String s [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("연핋의 개수를 입력하세여");
        int a = (int)(sc.nextInt()/12);
        sc.close();
        System.out.println("연필의 다스 수는" + a + "개 입니다");
    }
}
