public class ex10 
{
    public static void main(String[] args) 
    {
        String str="COMPUTERPROGRAMMING";

        System.out.println(solution(str, 'R'));
    }
    public static int solution(String s, char a)
    {
        StringBuilder answer = new StringBuilder(s);
        int count = 0;
        for(int i = 0; i < answer.length(); i++)
        {
            if(answer.charAt(i) == a)
            {
                count++;
            }
        }
        
        return count;
    }
}
