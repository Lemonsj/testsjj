import java.util.ArrayList;

import static java.lang.Math.abs;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-06
 * Time: 23:10
 **/
class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class Test {

    public String replaceSpace (String s) {
        // write code here
        if(s.length() == 0 || s == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

    public class Solution {
        //需要先反转单链表
        ArrayList<Integer> newArrayList = new ArrayList<>();
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            if(listNode != null) {
                this.printListFromTailToHead(listNode.next);
                newArrayList.add(listNode.val);
            }
            return newArrayList;
        }



        private int preIndex;
        public TreeNode reConstructBinaryTreeChild(int[] pre,int[] in, int ib,int ie) {
            if(ib > ie) {
                return null;
            }
            TreeNode root = new TreeNode(pre[preIndex]);
            int rootIndex = findIndex(in,pre[preIndex],ib,ie);
            preIndex++;
            if(rootIndex == -1) {
                return null;
            }
            root.left = reConstructBinaryTreeChild(pre,in,ib,rootIndex-1);
            root.right = reConstructBinaryTreeChild(pre,in,rootIndex+1,ie);
            return root;
        }
        public int findIndex(int[] in, int target,int ib,int ie) {
            while(ib <= ie) {
                if(in[ib] == target) {
                    return ib;
                }
                ib++;
            }
            return -1;
        }
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            if(pre == null || in == null) {
                return null;
            }
            TreeNode root = reConstructBinaryTreeChild(pre,in,0,in.length-1);
            return root;
        }
    }

    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int low = 0;
        int high = array.length-1;
        int mid = low;
        while(array[low] >= array[high]) {
            if(high-low == 1){
                mid = high;
                break;
            }
            mid = low +(high-low)/2;

            if(array[mid] >= array[low]) {
                low = mid;
            }else if(array[mid] <= array[high]) {
                high = mid;
            }

        }
        return array[mid];

    }

    public int Fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public int JumpFloor(int target) {
        if(target <= 1) {
            return 1;
        }
        return JumpFloor(target-1) + JumpFloor(target-2);
    }

    public int jumpFloorII(int target) {
        int first = 1;
        int sum = 1;
        while(target > 1) {
            sum += first;
            first = sum;
            target--;
        }
        return sum;
    }

    public int rectCover(int target) {
        if(target == 0) {
            return 0;
        }
        if(target == 1) {
            return 1;
        }
        if(target == 2) {
            return 2;
        }
        return rectCover(target -1) + rectCover(target -2);
    }

    public double Power(double base, int exponent) {
        double ret = 1;

        for(int i = 1; i <= abs(exponent); i++) {
            ret *= base;
        }
        if(exponent < 0) {
            return 1/ret;
        }
        return ret;
    }

    public int[] reOrderArray (int[] array) {
        // write code here
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while((left < right) && (array[left]%2 != 0)) {
                left++;
            }
            while((left < right) && (array[right]%2 == 0)) {
                right--;
            }
            swap(array[left],array[right]);
        }
        return array;
    }

    public void swap(int a,int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
}
