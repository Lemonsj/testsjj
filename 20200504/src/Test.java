import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] test=new int[N];
        int test1=0;
        int j=2;
        int test2=0;
        int test3=0;
        int test4=0;
        int k=0;
        int test5=0;
        for(int i=0;i<N;i++){
            test[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(test[i]%5==0&test[i]%2==0)
                test1=test1+test[i];
            else if(test[i]%5==1){
                j++;
                if(j%2!=0)
                    test2=test2+test[i];
                else
                    test2=test2-test[i];
            }
            else if(test[i]%5==2){
                test3=test3+1;
            }

            else if(test[i]%5==3){
                test4=test4+test[i];
                k++;
            }
            else if(test[i]%5==4&test5<test[i])
                test5=test[i];
            else
                continue;
        }

        if (test1==0)
            System.out.print("N"+" ");
        else
            System.out.print(test1+" ");
        if (test2==0)
            System.out.print("N"+" ");
        else
            System.out.print(test2+" ");
        if (test3==0)
            System.out.print("N"+" ");
        else
            System.out.print(test3+" ");
        if (test4!=0&k!=0){
            int data1=test4/k;
            int data2=test4%k;
            int data3=data2*10/k;
            double data=data1+data3*0.1;
            System.out.print(data+" ");
        }
        else
            System.out.print("N"+" ");
        if (test5==0)
            System.out.print("N");
        else
            System.out.print(test5);
    }
}
