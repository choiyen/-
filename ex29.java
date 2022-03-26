import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class ex29 {
    public static void main(String[] args) {
        String str = "teachermode";
        solution(str, 'e');
        
    }
    public static void solution(String str, char a)
    {
        int [] answer = new int[str.length()];
        char[] arr = str.toCharArray();
        int max = 1000;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == a)
            {
                max = 0;
                answer[i] = 0;
            }
            else
            {
                max++;
                answer[i] = max;
            }
        }
        max = 1000;
        for(int i = arr.length-1; i>=0; i--)
        {
            if(arr[i] == a)
            {
                max = 0;

            }
            else
            {
                max++;
                answer[i] = Math.min(answer[i],max);
            }
        }

        for(int i : answer)
        {
            System.out.print(i + " ");
        }
    }
}

