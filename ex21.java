public class ex21 {
    public static void main(String[] args) {
        int [] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};
        int cnt = 0, answer = 0;
        for(int x : arr)
        {
            if(x == 1)
            {
                cnt++;
                answer += cnt;
            }
            else
            {
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}
