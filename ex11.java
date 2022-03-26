public class ex11 
{
    public static void main(String[] args) 
    {
        String str="KOreaTimeGood";
        System.out.println(solution(str));
    }   
    public static int solution(String s)
    {
        int count = 0;
        StringBuilder answer = new StringBuilder(s);

        for(int i = 0; i < answer.length(); i++)
        {
            char c = answer.charAt(i);
            if( c >= 65 && c <= 90) count++;
        }
        return count;
    } 
}
