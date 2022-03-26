import java.util.Scanner;

public class ex37 
{
    public static void main(String [] args)
    {
        int N = 0;
        int M = 0;
        int [] count;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("100000까지의 자연수를 입력해주세요?");
            N = scan.nextInt();
            if(1<=N&&N<=100000)
            {
                break;
            }
            else
            {
                System.out.println("제입력하기 바랍니다.");
            }
        }
        while(true)
        {
            System.out.println("100000000까지의 자연수를 입력해주세요?");
            M = scan.nextInt();
            if(1<=M&&M<=100000)
            {
                break;
            }
            else
            {
                System.out.println("재입력하기 바랍니다.");
            }
        }  
        count = new int[N];
        for(int i = 0; i < N; i++)
        {
            System.out.println("숫자를 입력해주세요?");
            count[i] = scan.nextInt();
        }
        minout min = new minout();
        min.solution(M,count);
        min.solution1(M,count);
        scan.close();
    }
    
}
class minout
{
    void solution(int m,int [] arr)
    {
        int answer = 0; int lt = 0; int sum = 0;
        for(int rt = 0; rt <arr.length; rt++)
        {
            sum += arr[rt];
            if(sum == m) answer++;
            while(sum >= m)
            {
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }

        System.out.println("답 :   " + answer);
    }
    void solution1(int m,int [] arr)
    {
        int answer = 0; int lt = 0; int sum = 0;
        for(int rt = 0; rt <arr.length; rt++)
        {
            sum += arr[rt];
            if(sum <= m) answer++;
            while(sum > m)
            {
                sum -= arr[lt++];
                if(sum <= m) answer++;
            }
        }

        System.out.println("이하 답 :   " + answer);
    }
}
