import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-13
 * Time: 22:17
 **/
public class Test {
    public static int[][] transformImage(int[][] mat, int n) {
        int[][] res = mat;
        // i 行数，即旋转次数
        for(int i = 0; i < n / 2; i++){
            for(int j = i; j < n - 1 - i; j++){
                int help = res[i][j];
                res[i][j] = res[n - 1 - j][i];
                res[n - 1 - j][i] = res[n - 1 - i][n - 1 - j];
                res[n - 1 - i][n - 1 - j] = res[j][n - 1 - i];
                res[j][n - 1 - i] = help;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] res = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        /*int i = array.length;
        int j = array[0].length;
        System.out.println(i);
        System.out.println(j);*/
        /*for(int j = 0; j <= n-1; j++) {
            for(int i = n-1; i >= 0; i--) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }*/

        int[][] mat = transformImage(res,n);
        System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.toString(res));

    }

    public class Transform {
        public int[][] transformImage(int[][] mat, int n) {
            // write code here
            for (int layer = 0; layer < n / 2; layer++) {
                int first = layer;
                //上边界
                int last = n - 1 - layer;
                //下边界
                for (int i = first; i < last; i++) {
                    int top = mat[first][i];
                    //存储上边
                    mat[first][i] = mat[n - 1 - i][first];
                    //左到上
                    mat[n - 1 - i][first] = mat[last][n - 1 - i];
                    //下到左
                    mat[last][n - 1 - i] = mat[i][last];
                    //右到下
                    mat[i][last] = top;
                    //上到右
                }
            }
            return mat;
        }
    }
}
