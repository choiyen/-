import java.util.ArrayList;
import java.util.Stack;

public class ex18 
{
   public static void main(String[] args) {
       int [] a = {7, 3, 9, 5, 6, 12};
       Stack <Integer> stack = new Stack <> ();
       stack.push(a[0]);
       for(int i = 1; i < a.length; i++)
       {
           if(a[i] > a[i-1]) stack.push(a[i]);
       }
       System.out.println(stack);
   }    
}
