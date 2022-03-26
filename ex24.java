public class ex24 
{
    public static void main(String[] args) 
    {
        int [][] arr =
        {{5, 3, 7, 2, 3}, 
        {3, 7, 1, 6, 1},
        {7, 2, 5, 3, 4},
        {4, 3, 6, 4, 1},
        {8, 7, 3, 5, 2}};
        int answer = 0;
        int n =  arr.length;
        int [] dx={-1, 0, 1, 0};
        int [] dy={0, 1, 0, -1};
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                boolean flag = true;
                for(int k = 0; k <4; k++)
                {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
            
        }
        System.out.println(answer);

    }    
}
