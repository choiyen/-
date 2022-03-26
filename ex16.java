public class ex16 
{
    public static void main(String[] args) 
    {
        System.out.println(solution("ksekkset"));
    }
    public static String solution(String s)
    {
        String sout = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.indexOf(s.charAt(i)) == i)
            {
                sout += s.charAt(i);
            }
        }

        return sout;

    }    
}
