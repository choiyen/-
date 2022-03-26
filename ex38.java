import java.util.Scanner;

public class ex38 {
    public static void main(String [] args)
    {
        int N = 0;
        int K = 0;
        int [] count;
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("5부터 100000까지의 자연수를 입력해주세요?");
            N = scan.nextInt();
            if(5<=N&&N<=100000)
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
            System.out.println("2부터" + N + "까지의 자연수를 입력해주세요?");
            K = scan.nextInt();
            if(2<=K&&K<=N)
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
        minout1 min = new minout1();
        min.solution1(K,count);
        scan.close();
    }
    
}
class minout1
{
    void solution1(int k,int [] arr)
    {
        int answer = 0; 
        int sum = 0;
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;
        for(int i = k; i< arr.length; i++)
        {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        
        System.out.println("답 :   " + answer);
    }
}
