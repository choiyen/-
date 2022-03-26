public class ex28 {
    public static void main(String[] args) 
    {
      String str="g0en2T0s8eSoft";
      System.out.println(solution(str));    
    }
    public static int solution(String s)
    {
        String answer = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(48<=ch && ch <= 57)
            {
                answer += ch;
            }
        }
        return Integer.parseInt(answer);
    }
}
