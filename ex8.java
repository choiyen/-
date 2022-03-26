import java.util.*;

public class ex8 
{
    public static void main(String [] args)
    {
        int [] high = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        int sum = 0;
        int a = 0 , b = 0;

        
        for(int i = 0; i < high.length; i++)
        {
            sum += high[i];
        }
        for(int i = 0; i < 8; i++)
        {
            for(int j = i+1; j < 9; j++)
            {
                if((sum-(high[i]+high[j]))==100){
                  
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println("가짜 일곱 난쟁이는 " + high[a] + " 와 " + high[b] + " 입니다.");
        high[a] = 0;
        high[b] = 0;
        System.out.print("따라서 진짜 일곱 난쟁이에 해당되는 키는 " );
        for(int x : high)
        {
           if(x == high[0])
           {
                System.out.print(x + " ");  
           } 
           else if(x == 0)
           {

           }
           else
           {
                System.out.print(", " + x + " ");  
           }
        }
        System.out.print("입니다.\n");
    }    
}
