import java.util.Scanner;

public class ex4 
{
      public static void main(String s [])
      {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("1부터 어디까지의 자연수를 더하시겠습니까?");
        int a = sc.nextInt();
        int answer = 0;
        for(int i = 0; i <= a; i++)
        {
            answer += i;
        }
        sc.close();

        System.out.println(a+"까지의 자연수의 합은 " + answer + " 입니다.");
        
      } 
}
