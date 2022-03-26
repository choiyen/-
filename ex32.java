import java.util.Scanner;

import javax.print.FlavorException;

public class ex32 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = 0;
            int [] array;
            int answer = 0;
            int max = 0;
            int sum = 0;
            int tmp = 0;
            while(true)
            {
                System.out.println("3부터 100까지의 자연수를 입력하세요");
                a = scanner.nextInt();
    
                if(a>=3&&a<=100)
                {
                    break;
                }
                else
                {
                    System.out.println("다시 입력해주세요");
                }
            }
            array = new int[a];
            for(int i = 0; i<a; i++)
            {
                System.out.println("["+(i+1) + "] 번째 자연수를 입력해주세요");
                array[i] = scanner.nextInt();
            }
            solution(array);

        }
        public static boolean isPrime(int num)
        {
            if(num == 1) return false;
            System.out.println("들어감");
            for(int i=2; i<=(int)Math.sqrt(num); i++){
                if(num%i==0) return false;
            }
            return true;
        }
        public static void solution(int [] ant)
        {
            int [] answer = new int[ant.length];
            int i =0;
            for(int x : ant)
            {
                int res = 0;
                while(x > 0)
                {
                    int t = x%10;
                    res = res*10+t;
                    x = (int)(x/10);
                }
                if(isPrime(res))
                { 
                    answer [i] = res;
                    i++;
                }
            }
            for(int x = 0; x<ant.length; x++)
            {
                if(answer[x] > 0)
                {
                    System.out.print(answer[x] + " ");
                }
            }
        }
        
}
