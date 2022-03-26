import javax.lang.model.util.ElementScanner14;

public class ex20 
{
    public static void main(String[] args) {
        
        int [] a = {2, 3, 3, 1, 3};
        int [] b = {1, 1, 2, 2, 3};
        int count = 0;
        System.out.println(b.length);
        for(int i = 0; i < b.length; i++)
        {
            System.out.println((i+1) + "번째 게임의 결과");
            if(a[i] == b[i]) 
            {
                count++;
                System.out.println("D"+count);
                
            }
            else if(a[i] == 1 && b[i] == 3) 
            {
                count++;
                System.out.println("A"+count);
            }
            else if(a[i] == 2 && b[i] == 1) 
            {
                count++;
                System.out.println("A"+count);
            }
            else if(a[i] == 3 && b[i] == 2) 
            {
                count++;
                System.out.println("A"+count);
            }
            else
            {
                count++;
                System.out.println("B"+count);
              
            }
        }
        
    }    
}
