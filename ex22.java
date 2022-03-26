public class ex22 {
    public static void main(String[] args) {
        int [] arr= {87, 89, 92, 100, 76};
        int [] answer = new int[arr.length];
        for(int i = 0; i <  answer.length; i++)
        {
            answer[i] = 1;
            for(int k = 0; k < answer.length; k++)
            {
                if(arr[k] > arr[i]) answer[i]++;
            }
        }
        for(int i = 0; i < answer.length; i++)
        {
            System.out.println(answer[i]);
        }
    }
}
