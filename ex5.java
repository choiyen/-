public class ex5 
{
    public static void main(String s [])
    {
        int [] a =  {5,7,1,3,2,9,11};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++)
        {
           if(a[i] < min) min = a[i];                                        
        }
        System.out.println("가장 작은 수는 " + min + " 입니다.");
    } 
}
