public class ex15 
{
    public static void main(String[] args) 
    {
        
        System.out.println(solution("good"));
    }
    public static String solution(String s)
    {

        String answer = "";
        int mid = (int)Math.floor(s.length()/2);
        System.out.println(mid);
        if(s.length()%2 == 1) 
        {
            answer = s.substring(mid, mid+1);
            System.out.println(mid);   
        }
        else answer = s.substring(mid-1,mid+1);
        return answer;
    }    
}
