import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex39 
{
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
         
            String str = scan.next();
            solution(str);
    }
    public static void solution(String str)
    {
        char answer = ' ';
        HashMap <Character,Integer> hMap = new HashMap<Character,Integer>();
        char [] out = str.toCharArray();
        for(char s : out)
        {
            hMap.put(s, hMap.getOrDefault(s, 0) +1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : hMap.keySet())
        {
            int val = hMap.get(key);
            if(max < val)
            {
                max = val;
                answer = key;
            }
        }
        System.out.println("당선자는 " +answer + "득표 수는  " + max + "  입니다.");
    }
}
