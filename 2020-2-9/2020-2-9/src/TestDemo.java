import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestDemo {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] == target) {
                while(mid >= left && nums[mid] == target) {
                    mid--;
                }
                result[0] = mid+1;
                mid = (left + right)/2;
                while(mid <= right && nums[mid] == target) {
                    mid++;
                }
                result[1] = mid-1;
            }else if(nums[mid] > target) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return result;

    }
    public static boolean isPalindrome(String s) {
        if(s == "") {
            return true;
        }
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < s.length(); i ++) {
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                str.append(i);
            }
        }
        /*int left = 0;
        int right = str.length()-1;*/
        int i = 0;
        int j = str.length()-1;
        while(i <= j) {
            if((str.charAt(i) == str.charAt(j) || str.charAt(i) + 32 == str.charAt(j)) || str.charAt(i) - 32 == str.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
        /*String ptr = str.toString();
        char[] ptr1 = ptr.toCharArray();
        char[] ptr2 = ptr1.clone();
        while(left <= right) {
            char tmp = ptr1[left];
            ptr1[left] = ptr1[right];
            ptr1[right] = tmp;
            left++;
            right--;
        }
        int i = 0, j = 0;
        for(i = 0, j = 0; i < ptr1.length && j < ptr2.length; i++, j++) {
            if(ptr1[i] != ptr2[j] && ptr1[i] + 32 != ptr2[j] && ptr1[i] - 32 != ptr2[j]) {
                return false;
            }
        }
        return true;*/
    }

    public static int compress(char[] chars) {
        StringBuffer str = new StringBuffer();
        int count = 1;
        for(int i = 0; i < chars.length; i++) {
            str.append(i);
            char tmp = chars[i];
            while(i < chars.length-1 &&tmp == chars[i+1]) {
                count++;
                i++;
            }
            str.append(count);
        }
        char[] ptr = (str.toString()).toCharArray();
        chars = ptr.clone();
        return str.length();



    }
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int p = len+1;
        int q = len;
        for(int i = 1; i< len; i++) {
            if(nums[i] < nums[i-1]) {
                int j = i;
                while(j > 0 && nums[j] < nums[j-1]) {
                    int t = nums[j];
                    nums[j] =nums[j-1];
                    nums[j-1] = t;
                    j--;
                }
                p = j< p ? j : p;
                q = i;
            }
        }
        return q - p +1;
    }

    public static int evalRPN(String[] tokens) {
        int i=0;
        Stack<Integer> s;
        int ret=0;
        while(i<tokens.length){
            while(i<tokens.length && tokens[i]!="+" && tokens[i]!="-" && tokens[i]!="*" && tokens[i]!="/")
                s.push(tokens[i++]);
            int right_num=s.pop();
            if(s.empty())
                return right_num;
            int left_num=s.pop();
            if(tokens[i]=="+")
                ret=left_num+right_num;
            else if(tokens[i]=="-")
                ret=left_num-right_num;
            else if(tokens[i]=="*")
                ret=left_num*right_num;
            else if(tokens[i]=="/")
                ret=left_num/right_num;
            s.push(ret);
            i++;
        }
        return s.pop();

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length ==0){
            return list;
        }
        backtrack(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
    private void backtrack(List<List<Integer>> list,List<Integer> temp,int[] nums,int begin){
        list.add(new ArrayList<Integer>(temp));
        for(int i=begin;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
    private int[] row = {-1,1,0,0};
    private int[] col = {0,0,-1,1};

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length ==0 || matrix[0].length == 0)
            return 0;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] len = new int[matrix.length][matrix[0].length];
        int max = 0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max = Math.max(max,find(matrix,visited,len,i,j));
            }
        }
        return max;
    }
    private int find(int[][] matrix,boolean[][] visited,int[][] len,int x,int y){
        if(visited[x][y])
            return len[x][y];
        len[x][y] = 1;
        for(int i=0;i<4;i++){
            int curX = x + row[i];
            int curY = y + col[i];
            if(curX >=0 && curX < matrix.length && curY >=0 && curY<matrix[0].length && matrix[curX][curY] < matrix[x][y]){
                len[x][y] = Math.max(len[x][y],find(matrix,visited,len,curX,curY)+1);
            }
        }
        visited[x][y] = true;
        return len[x][y];
    }

    float f[][] = new float[6][6];
    float []f1[] = new float[6][6];
    float f2[][] = new float[][6];
    float [][]f3 = new float[6][6];
    float [][]f4 = new float[6][];
    public boolean isMatch(String s, String p) {
        int ns = s.length();
        int np = p.length();
        if(np == 0) {
            return ns == 0;
        }
        if(ns == 0) {
            for (int i = 0; i < np; i++) {
                if(p.charAt(i) != '*') {
                    return false;
                }
            }
            return true;
        }
        if(p.charAt(np - 1) == '?' || s.charAt(ns - 1) == p.charAt(np - 1)) {
            return isMatch(s.substring(0, ns - 1), p.substring(0, np - 1));
        }
        if(p.charAt(np - 1) == '*') {
            for (int i = 0; i <= ns; i++) {
                if(isMatch(s.substring(0, i), p.substring(0, np - 1))) {
                    return true;
                }
            }
        }
        return false;    
    }

    public static void main(String[] args) {
        /*char[] str = {'a','a','b','b','c','c','c'};
        System.out.println(compress(str));*/
        int[] array = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(array));
    }
    public static void main3(String[] args) {
        String str = "";
        boolean ret = isPalindrome(str);
        System.out.println(ret);
    }
    public static void main2(String args[]){
        int num = 10;
        System.out.println(test(num));
    }
    public static int test(int b){
        try {
            b += 10;
            return b;
        }catch(RuntimeException e){
        }catch(Exception e2){
        } finally{
            b += 10;
            return b;
        }
    }
}
