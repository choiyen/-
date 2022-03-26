import java.io.IOException;
import java.util.Scanner;

public class ex7 
{
    public static void main(String s []) throws IOException
    {
        int [] arr = {25,23,11,47,53,17,33};

        System.out.println("자동차 10부제 날짜 알리미\n\n");
        



        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("오늘 날짜를 입력해주시겠습니까?");
            int day = (int)((sc.nextInt()%10));
            int answer = 0;
            for(int x : arr)
            {
                if(x%10 == day)
                {
                    answer++;
                } 
            }

            if(answer > 0)
            {
                System.out.println("오늘 등록되는 차랑 중에 위반되는 차의 대수는 " + answer + "대 압니다.");
            }
            else
            {
                System.out.println("오늘 등록되는 차랑 중에 위반되는 챠량은 없습니다.");    
            }
            System.out.println("재실행하시겠습니까?(1이 아닌 다른 수를 입력할 경우 모두, 시스템을 종료합니다.");
            int out = (int)sc.nextInt();
            if(out == 1)
            {
                continue;
            }
            else
            {
                sc.close();
                break;
            }
        }
        
        
    }
    
}
