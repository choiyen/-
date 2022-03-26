public class ex30 
{
    public static void main(String[] args) 
    {
        String str="KKHSSSSSSSE";
        solution(str);
    }
    public static String solution(String s)
    {

        String answer = "";
        int cnt  = 1;
        char [] arr = s.toCharArray();
        for(int i = 0; i < s.length()-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                cnt++;
            }
            else
            {
                answer += arr[i];
                if(cnt > 1) answer += cnt;
                cnt = 1;
            }
        }
        
        System.out.println(answer);
        return answer;
    }    
}
