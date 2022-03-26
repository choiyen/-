import java.util.*;

public class ex1
{
        
        
        public static void main(String[] args) 
        {
                int a;
                int b;
                int c;
               
                Scanner sc = new Scanner(System.in);
                System.out.println("첫번째 숫자를 입력하세요");
                a = sc.nextInt();
                System.out.println("두번째 숫자를 입력하세요");
                b = sc.nextInt();
                System.out.println("세번째 숫자를 입력하세요");
                c = sc.nextInt();
                
               int answer1 = solution(a,b,c);

               System.out.println("가장 작은 자연수는    " + answer1 + "입니다.");
               sc.close();
                
        }
        public static int solution(int a, int b, int c)
        {
                int answer = 0;
                if(a < b) answer = a;
                else answer = b;
                if(c < answer) answer = c;
           
                return answer;
        }
}