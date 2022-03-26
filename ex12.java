public class ex12 
{
 
    

    public static void main(String[] args) 
    {
        String str="ItisTimeToStudy";
        System.out.println(solution(str));
    }
    public static StringBuilder solution(String s)
    {
        StringBuilder answer = new StringBuilder(s);
        for(int i = 0; i < answer.length(); i++)
        {
            if(answer.charAt(i) >= 97 && answer.charAt(i) <=122)
            {
                answer.setCharAt(i, (char)(answer.charAt(i)-32));
            }
        }

        return answer;
    }
}
