/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-24
 * Time: 16:00
 **/
import java.util.*;

class Main
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        int N, M;

        while(in.hasNextInt())
        {
            N = in.nextInt();
            M = in.nextInt();

            int [] score = new int[N + 1];
            for(int i = 1; i <= N; i++)
            {
                score[i] = in.nextInt();
            }

            while(M-- != 0)
            {
                String c = in.next();
                int A = in.nextInt();
                int B = in.nextInt();
                if(c.equals("Q"))
                {
                    if(A > B)
                    {
                        int temp = A;
                        A = B;
                        B = temp;
                    }
                    int max = findMax(score, A, B);
                    System.out.println(max);
                }
                else if(c.equals("U"))
                {
                    score[A] = B;
                }
            }
        }
    }

    private static int findMax(int [] score, int left, int right)
    {
        if(left == right)
            return score[left];
        int max = score[left];
        for(int i = left + 1; i <=right; i++)
        {
            if(score[i] > max)
                max = score[i];
        }
        return max;
    }
}

public class Demo {
}
