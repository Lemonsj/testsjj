/*class A<T> {
    public T value;

    public A(T value) {
        this.value = value;
    }


    public T get() {
        return value;
    }
}*/

public class TestDemo {
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int t = sum % 3;
        if (t != 0) {
            return false;
        } else {
            int q = sum / 3;
            int count = 0;
            int tmp = 0;
            while (i < A.length) {
                tmp += A[i];
                if (tmp == q) {
                    tmp = 0;
                    count++;
                    i++;
                }
            }
            if (count == 3) {
                return true;
            }
            return false;
        }
    }
    public int[][] shiftGrid(int[][] grid, int k) {
        int[] array = new int[100];
        int m = grid.length;
        int n = grid[0].length;

        while(k-- > 0) {
            for(int i = 0; i < m; i++) array[i] = grid[i][n-1];
            for(int j = n-1; j>0; j++){
                for(int i = 0; i < m; i++){
                    grid[i][j] = grid[i][j-1];
                }
            }
            grid[0][0] = array[n-1];
            for(int i = 1;i < m;i++)  grid[i][0] = array[i-1];
        }
        return grid;
    }
    public static void main3(String[] args) {
        int[] A = {0,2,1,-6,6,-7,9,1,2,0,1};

        System.out.println(canThreePartsEqualSum(A));

    }
    public static void main2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtTail(4);
        myLinkedList.get(3);
    }

    /*public static void main1(String[] args) {
        //List<A> list = new List<>(String);
        A<String> str = new A<String>("wangchenyi");
        System.out.println(str);
        System.out.println(str.value);
    }*/
}
