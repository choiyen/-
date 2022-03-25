import java.util.HashMap;
import java.util.Scanner;

public class ex40 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 문자를 입력하세요. 글자수 제한 없음");
        String s = scanner.nextLine();
        System.out.println("두번째 문자를 입력하세요. 글자수 제한 없음");
        String v = scanner.nextLine();

        mount mout = new mount();
        //mout.inera(s, v);
        mout.ineav(s, v);
    }

}
class mount
{
    void inera(String s, String v)
    {
        HashMap <Character,Integer> Hashmap = new HashMap<Character,Integer>();
        String answer = "YES";
        for(char x : s.toCharArray())
        {
            Hashmap.put(x, Hashmap.getOrDefault(x, 0)+1);
        }
        for(char x : v.toCharArray())
        {
            if(!Hashmap.containsKey(x) || Hashmap.get(x)==0)
            {
                answer = "NO";
                break;
            }
            Hashmap.put(x, Hashmap.get(x)-1);
        }

        System.out.println("답 : "+ answer);
    }
    void ineav(String s, String v)
    {
        HashMap<Character, Integer> coutMapa = new HashMap<>();
        HashMap<Character, Integer> coutMapb = new HashMap<>();
        int result = 0;
        int lt = 0;
        int L = v.length()-1;
        for(char x : v.toCharArray())
        {
            coutMapb.put(x, coutMapb.getOrDefault(x, 0)+1);
        }
        for(int i = 0; i <L; i++)
        {
            coutMapa.put(s.charAt(i),coutMapa.getOrDefault(s.charAt(i),0)+1);
        }
        for(int rt = L; rt<s.length(); rt++)
        {
            coutMapa.put(s.charAt(rt), coutMapa.getOrDefault(s.charAt(rt), 0)+1);
            if(coutMapa.equals(coutMapb))
            {
                result++;
            }
            coutMapa.put(s.charAt(lt), coutMapa.get(s.charAt(lt))-1);
            if(coutMapa.get(s.charAt(lt)) == 0)
            {
                coutMapa.remove(s.charAt(lt));
            }
            lt++;

        }
        System.out.println(result);
    }
}