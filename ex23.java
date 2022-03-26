public class ex23 {
    public static void main(String[] args) 
    {
        int max = Integer.MIN_VALUE;
        int [][] arr=
        {{10, 13, 10, 12, 15}, 
        {12, 39, 30, 23, 11},
        {11, 25, 50, 53, 15},
        {19, 27, 29, 37, 27},
        {19, 13, 30, 13, 19}};
        int n = arr.length;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++)
        {
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < n; j++)
            {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max  = Math.max(max,sum1);
            max  = Math.max(max,sum2);
        }
        sum1 = 0; sum2 = 0;
        for(int i = 0; i < n; i++)
        {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        max = Math.max(max,sum1);
        max = Math.max(max, sum2);
        System.out.println(max);
    }
}
