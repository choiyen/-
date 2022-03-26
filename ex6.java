import java.util.Stack;

public class ex6 
{
  public static void main(String s [])
  {
      int [] a = {12,77,38,41,53,92,85};
      System.out.println(solution(a));
      
  }   
  public static Stack <Integer> solution(int [] a)
  {
     
    Stack <Integer> st = new Stack <Integer> ();
      int sum = 0, min = 1000;
      for(int x : a)
      {
        if(x%2 == 1)
        {
            sum += x;
            if(x <min) min = x;
        }
      }
      st.push(sum);
      st.push(min);
    return st;
  }
}
