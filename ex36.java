import java.util.Arrays;
import java.util.Stack;

public class ex36 {
    public static void main(String[] args) 
    {
            int [] a= {1, 3, 5};
            int [] b= {2, 3, 6, 7, 9};
            int [] a1= {1, 3, 9, 5, 2};
            int [] b1= {3, 2, 5, 7, 8};
            solution(a, b);
            solution1(a1, b1);
    }
    public static void solution(int [] a, int [] b)
    {
        Stack <Integer> stack = new Stack<Integer>();
        int n = a.length;
        int m = b.length;
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m)
        {
            if(a[p1] <= b[p2]) stack.push(a[p1++]);
            else stack.push(b[p2++]);
        }
        while(p1 < n) stack.push(a[p1++]);
        while(p2 < m) stack.push(b[p2++]);

        System.out.println(stack);
    }
    public static void solution1(int [] a, int [] b)
    {
        Stack <Integer> stack = new Stack<Integer>();
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int m = b.length;
        int p1 = 0;
        int p2 = 0;
        while(p1 < n && p2 < m)
        {
            if(a[p1]==b[p2])
            {
                stack.push(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        System.out.println(stack);
    }
    
}
