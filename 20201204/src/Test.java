import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-04
 * Time: 17:10
 **/

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            HashMap<Character,Integer> map = new HashMap<>();
            String str = new String(num+"");
            int count = 1;
            for(int i = 0; i < str.length(); i++) {
                if(map.get(str.charAt(i)) == 0) {
                    map.put(str.charAt(i),count);
                }else {

                }
            }
            for(int i = 0; i < map.size(); i++) {
                if(map.get(i+'0') != 0){
                    System.out.println(i + ":" + map.get(i));
                }
            }
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int[] array = new int[10];
            for(int i = 0; i < str.length(); i++) {
                array[str.charAt(i)-48]++;
            }
            for(int i = 0; i < 10; i++) {
                if(array[i] != 0) {
                    System.out.println(i+":"+array[i]);
                }
            }
        }
    }

    public static int getValue(int i) {
        int result = 0;
        switch(i){
            case 1:
                result = result+i;
            case 2:
                result = result+i*2;
            case 3:
                result = result + i*3;
        }
        return result;
    }

    public static void main3(String[] args) {
        int ret = getValue(2);
        System.out.println(ret);
    }

    public static int[] towSum(int[] nums,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return ret;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = 0;
        ListNode newHead = new ListNode(0);
        //ListNode cur = newHead.next;
        ListNode cur = new ListNode(0);
        newHead.next = cur;

        while(l1 != null || l2 != null || num != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + num;
            num = sum / 10;      //十位
            int tmp = sum % 10;  //个位
            cur.val = tmp;

            l1 = l1 != null ? l1 = l1.next : l1;
            l2 = l2 != null ? l2 = l2.next : l2;
            if(l1 != null || l2 != null || num != 0) {
                cur.next = new ListNode(0);
                cur = cur.next;
            }
        }
        return newHead.next;
    }

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        List<Character> list = new ArrayList<>();
        int count = 0;
        int i = 0;
        Boolean flag = false;
        if(s == " ") {
            return 1;
        }
        while(i < len) {
            if(!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
                i++;
            }else {
                if(flag == false) {
                    count = list.size();
                    flag = true;
                }else{
                    if(count < list.size()){
                        count = list.size();
                    }
                }
                list = new ArrayList<>();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = " ";
        int ret = lengthOfLongestSubstring(s);
        System.out.println(ret);
    }

    public static int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        int count = 0;
        int ret = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> map = new HashSet<>();
        while(start < len && end < len) {
            if(map.contains(s.charAt(end))) {
                map.remove(s.charAt(start++));
            }else {
                map.add(s.charAt(end++));
                ret = Math.max(ret,end-start);
            }
        }
        return ret;
    }
}
