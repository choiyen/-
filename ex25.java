public class ex25 {
    


    public static void main(String[] args) {
        String str = "goooG";
        System.out.println(solution(str));
    }
    public static String solution(String str)
    {
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();
        /*
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != str.charAt(len-i-1))
            {
                answer = "NO";
            }
        }
        */
        return answer;
    }
}
//자바스크립트에선 자동으로 len이라는 변수가 자동으로 배열처럼 변환되어 처리됨.
//반면, 자바에서는 charAt을 사용해야 그 단어를 비교할 수 있다.
