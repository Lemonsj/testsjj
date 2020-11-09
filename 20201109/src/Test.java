import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-09
 * Time: 22:17
 **/
public class Test {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList();

        if(matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        //定义行的边界
        int left = 0;
        int right = matrix[0].length-1;
        //定义列的边界
        int up = 0;
        int down = matrix.length-1;
        while(true) {
            if(left > right) {
                return list;
            }
            for(int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            up++;

            if(up > down) {
                return list;
            }
            for(int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(left > right) {
                return list;
            }
            for(int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            down--;

            if(up > down) {
                return list;
            }
            for(int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }

    }

    public boolean searchMatrix (int[][] matrix, int target) {
        // write code here
        if(matrix[0].length == 0 || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }else if(matrix[row][col] > target) {
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
