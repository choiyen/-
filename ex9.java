import java.util.*;

public class ex9
{ 
   public static void main(String [] args)
   {
      String s = "BANANA";
      System.out.println(solution(s));

   } 
   
   
   
   /*public static String solution(String s)
   {
      String answer = s;
      answer = answer.replace("A", "#");  

     return answer;
   } 
   */
  
   public static StringBuilder solution(String s)
   {
      StringBuilder answer = new StringBuilder(s);
      for(int i = 0; i< answer.length(); i++)
      {
         if(answer.charAt(i) == 'A')
         {
            answer.setCharAt(i, '#');
         }
      }

      
      return answer;
   }
}
