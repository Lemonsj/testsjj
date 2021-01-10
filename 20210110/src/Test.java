/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-10
 * Time: 23:08
 **/
public class Test {
    public static void main(String[] args) {

    }


    public int MoreThanHalfNum_Solution(int[] array) {
        if(array==null)
            return 0;
        int N=array.length;
        int root=0;
        int count=0;

        for(int i=0;i<N;i++){
            if(count==0){
                root=array[i];
                count=1;
            }
            if(array[i]==root){
                count++;
            }else{
                count--;
            }
        }

        if (checkArray(array, root)) {
            return root;
        } else
            return 0;
    }

    public int MoreThanHalfNum_Solution_1(int[] array) {

        if (array == null)
            return 0;
        int N = array.length;
        int middle = N / 2;
        int index = partition(array, 0, N - 1);
        while (index != middle) {
            if (index > middle) {
                index = partition(array, 0, index - 1);
            } else
                index = partition(array, index + 1, N - 1);
        }
        if (checkArray(array, array[index])) {
            return array[index];
        } else
            return 0;
    }


    private int partition(int[] array, int left, int right) {
        // 判断数组是否只有一个元素
        if (left == right)
            return left;
        int root = array[left];
        int i = left, j = right + 1;
        while (true) {
            while (array[++i] <= root) {
                if (i == right)
                    break;
            }

            while (array[--j] >= root) {
                if (j == left)
                    break;
            }
            if (i < j)
                exch(array, i, j);
            else
                break;
        }
        exch(array, left, j);
        return j;
    }
    private boolean checkArray(int[] array, int root) {
        int N = array.length;
        int num = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] == root) {
                num++;
            }
        }
        if (num * 2 > N)
            return true;
        else
            return false;
    }

    private void exch(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }
}
