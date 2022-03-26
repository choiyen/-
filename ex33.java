import java.lang.constant.DirectMethodHandleDesc;
import java.util.Scanner;

public class ex33 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int [][] count;
        int n = 0;
        int c = 0;
        while(true)
        {
            System.out.println("반의 학생수를 입력하세요?");
            n = scan.nextInt();
            System.out.println("수학 테스트 갯수를 입력하세요?");
            c = scan.nextInt();

            if((1<=n&&n<=20)&&(1<=c&&c<=10))
            {
                break;
            }
            else
            {
                System.out.println("재입력 부탁드립니다.");
            }
        }

        count = new int[c][n];
        for(int i = 0; i< c; i++)
        {
            System.out.println((i+1)+"번째 수학 시험의 등수를 입력해주세요?");
            for(int j =0; j < n; j++)
            {
                System.out.println((j+1)+"번째 아이의 성적?");
                
                 while(true)
                 {
                    count[i][j] = scan.nextInt();
                    if(0<=count[i][j]&&count[i][j] <=n)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("아이의 성적을 다시 입력해주세여?");
                        System.out.println((j+1)+"번째 아이의 성적?");        
                    }
                 }
            }
        }

        System.out.println(n+" "+c);
        for(int i = 0; i< c; i++)
        {
            for(int j =0; j < n; j++)
            {   
                System.out.print(count[i][j]);
            }
            System.out.print("\n");
            
        }
        solutionfin ofn = new solutionfin();
        ofn.solution(count);
    }
}
class solutionfin
{
    void solution(int [][] test)
    {
        int answer = 0;
        int m = test.length;
        int n = test[0].length;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                int cnt = 0;
                for(int k = 0; k < m; k++)
                {
                    int pi = 0;
                    int pj = 0;
                    for(int s = 0; s < n; s++)
                    {
                        if(test[k][s] == i) pi = s;
                        if(test[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }
        System.out.println("시스템에 만족으로 뜨는 멘토의 숫자는?");
        System.out.println(answer+"");
    }
}
    
