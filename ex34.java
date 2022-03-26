import java.util.Arrays;
import java.util.Scanner;

public class ex34 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] count;
        int n = 0;
        int c = 0;
        while(true)
        {
            System.out.println("선물가능한 최대 학생수?");
            n = scan.nextInt();
            System.out.println("소비가능한 금액의 액수를 입력하세요?");
            c = scan.nextInt();

            if((1<=n&&n<=1000)&&(1<=c&&c<=100000000))
            {
                break;
            }
            else
            {
                System.out.println(" N은 1000까지, M은 100,000,000까지의 수로 재입력 부탁드립니다.");
            }
        }

        count = new int[n][2];
        for(int i = 0; i< n; i++)
        {
            System.out.println((i+1)+"번째 아이가 원하는 제품의 가격를 입력해주세요?");
            while(true)
            {
                count[i][0] = scan.nextInt();
                if(1<=count[i][0]&&count[i][0]<=100000)
                {
                    break;
                }
                else
                {
                    System.out.println("재입력 " +(i+1)+"번째 아이가 원하는 제품의 가격를 입력해주세요?*(100000 이하)");
                    
                }
            }
            System.out.println((i+1)+"번째 아이가 원하는 제품의 배송비를 입력해주세요?*(100000 이하)");
            while(true)
            {
                count[i][1] = scan.nextInt();
                if(1<=count[i][1]&&count[i][1]<=100000)
                {
                    break;
                }
                else
                {
                    System.out.println("재입력 " +(i+1)+"번째 아이가 원하는 제품의 배송비를 입력해주세요?*(100000 이하)");
                }
            }
        }

        System.out.println(n+" "+c);
        for(int i = 0; i< n; i++)
        {
            for(int j =0; j < 2; j++)
            {   
                System.out.print(count[i][j] + "  ");
            }
            System.out.print("\n");
            
        }
        meet met = new meet();
        met.solution(c , count);
        scan.close();
    }    
}
class meet
{
    void solution(int m ,int count [][])
    {
        int answer = 0;
        int n = count.length;
        Arrays.sort(count,(o1,o2) -> {
            return o1[0]-o2[0];
        });
        for(int i = 0; i < n; i++)
        {
            int money = m -(count[i][0]/2+count[i][1]);
            int cnt = 1;
            for(int j = 0; j < n; j++)
            {
                if(j != i && (count[j][0]+count[j][1])>money) break;
                if(j != i && (count[j][0]+count[j][1])<=money){
                    money-=(count[j][0]+count[j][1]);
                    cnt++;
                }
            }
            answer = Math.max(answer,cnt);
        }

        System.out.println("선생님이 최대로 줄 수 있는 학생의 숫자는 :"+answer);
    }
}

