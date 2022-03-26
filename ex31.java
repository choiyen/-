import java.util.Scanner;

public class ex31 
{
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
        for(int x : array)
        {
            sum = 0; tmp = x;
            while(tmp > 0)
            {
                sum += (tmp%10);
                tmp = (int)Math.floor(tmp/10);
            }
            System.out.println(max + "    " + answer);
            if(sum > max)
            {
                max = sum;
                answer = x;
                System.out.println("계산결과 : "+max + "    " + answer);
            }
            else if(sum == max)
            {
                if(x > answer) answer = x;
                System.out.println("계산결과 : "+max + "    " + answer);
            }
        }
        System.out.println(answer);
    }
    public static int solution(int [] arr)
    {
        int answer = 0;

        return answer;
    }    
}
