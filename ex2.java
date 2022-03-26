import java.util.Scanner;

public class ex2 
{
     public static void main(String s[])
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하세요");
        int a = sc.nextInt();
        System.out.println("두번째 수를 입력하세요");
        int b = sc.nextInt();
        System.out.println("세번쨰 수를 입력하세요");
        int c = sc.nextInt();
        sc.close();

        String answer = solution(a, b, c);
        System.out.print("해당 숫자는 삼각형이");
        if(answer == "YES")
        {
            System.out.print(" 맞습니다.");
        }
        else
        {
            System.out.print(" 아닙니다.");
        }
     }
    public static String solution(int a, int b, int c)
    {
        String answer = "YES";
        int max;
        int tot = a+b+c;
        if(a > b) max = a;
        else max = b;
        if(c > max) max = c;
        if(tot - max <= max) answer = "NO";
        return answer;
    }
}
