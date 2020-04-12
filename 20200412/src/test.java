public class test {
    public static void main1(String[] args) {
        int x = 0;
        int y = 0;
        for(int i = 1; i <= 30; i++) {
            x += 10;
            y += (int)Math.pow(2,i);
        }
        System.out.println(x + "万元" + " " + y + "分");
    }
    public static void main2(String[] args) {
        int x = 0;
        int y = 0;
        x = 10*30;
        //for(int i = 1; i <= 30; i++) {
        //x += 10;
        //y += (int)Math.pow(2,i);
        //}
        y = (int)(Math.pow(2,30)-1);
        System.out.println(x + " " + y);
    }

    public static void main3(String[] args) {
        int[] prices = {3,8,5,1,7,8};
        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    int tmp = prices[i];
                    prices[i] = prices[j];
                    prices[j] = tmp;
                }
            }
        }
        System.out.println(2*prices[prices.length-1] - (prices[0] + prices[1]));
    }

    //回顾
    public static void selectSort(int[] arr)	{
        for (int i=0 ; i<arr.length-1 ; i++ )	{
            for (int j=i+1; j<arr.length ; j++ ) {
                if(arr[i] > arr[j])	{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void bubbleSort(int[] arr)	{
        for (int i=0 ; i<arr.length-1 ; i++ )	{
            for (int j=0; j<arr.length-1-i ; j++ )	{
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

    }
}
