public class ex27 {
    public static void main(String[] args) {
        String str= "found7, time: study; Yduts; emit, 7Dnuof";
        System.out.println(solution(str));
    }
    public static String solution(String s)
    {
        String answer = "";
        char [] arr = s.toLowerCase().toCharArray();
        for(char a : arr)
        {
            if(Character.isAlphabetic(a))
            {
                answer += a;
            }
        }
        String tmp = new StringBuilder(answer).reverse().toString();
        if(answer.equals(tmp))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        return answer;
    }
}
