public class ex19 
{
    public static void main(String[] args) 
    {
        int [] arr= {130, 135, 148, 140, 145, 150, 150, 153};
        int answer = 1 , max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                answer++;
                max = arr[i];
            }
        }

        System.out.println(answer);
    }
        
}
