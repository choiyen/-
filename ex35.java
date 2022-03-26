import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class ex35
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        int K = 0;
        int [] sam;
        while(true)
        {
            System.out.println("3부터 100까지의 자연수 중에 하나를 입력하세요.");
            N = scan.nextInt();

            System.out.println("1부터 50까지의 자연수 중에 하나를 입력하세요.");
            K = scan.nextInt();

            if((3<=N && N<=100)&&(1<=K&& K <= 50))
            {
                break;
            }
            else
            {
                System.out.println("재입력을 부탁드립니다");
            }
        }
        sam = new int[N];
        for(int i = 0; i < N; i++)
        {   
            System.out.println((i+1)+"번째 자연수를 입력하세요");
            sam[i] = scan.nextInt();
        }

        System.out.println(N + "  " + K + "\n");

        for(int i = 0; i < N; i++)
        {   
            System.out.print(sam[i] + "   ");
        }

        Bignumber(N, K, sam);
        scan.close();
    }
    public static void Bignumber(int N, int K, int [] arr)
    {
        int answer = 0;
        Set <Integer> tmp = new TreeSet<Integer>();
        for(int i = 0; i < N; i++)
        {
            for(int u = i+1; u < N; u++)
            {
                for(int k= u+1; k< N; k++)
                {
                    tmp.add(arr[i]+arr[u]+arr[k]);
                }
            }
        }
        Integer [] rot = tmp.toArray(new Integer[0]);
        Arrays.sort(rot,Comparator.reverseOrder());
        answer = rot[K-1];
        for(int i = 0; i < rot.length; i++)
        {
            System.out.println(rot[i]+"  ");
        }
        System.out.println("답: " + answer);
    }    
}
