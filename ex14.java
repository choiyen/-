public class ex14 
{
    
    
    public static void main(String[] args) 
    {
        String [] str={"teacher", "time", "student", "beautiful", "good"};
        System.out.println(solution(str));
    }
    public static String solution(String [] s)
    {
        String answer = "";
        int count = 0;
        for(int i = 0; i < s.length; i++)
        {
            if(count <= s[i].length())
            {
                count = s[i].length();
                answer = s[i];
            }
        }

        return answer;
    }
}
