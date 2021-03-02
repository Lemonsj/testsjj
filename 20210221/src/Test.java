import javafx.scene.effect.SepiaTone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-21
 * Time: 16:46
 **/
public class Test {
    public static void main1(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(x+y +""+(x+y)+y);
        mystery(1234);

    }

    public static void mystery (int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0){
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

    public String toLowerCase(String str) {
        char[] ptr = str.toCharArray();
        StringBuffer p = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if(ptr[i] >= 'A' && ptr[i] <= 'Z') {
                p.append((ptr[i] + "").toLowerCase());
            }else {
                p.append((ptr[i] + ""));
            }
        }
        return p.toString();
    }

    public void roate(int[] nums,int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start +=1;
            end -=1;
        }
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int count = n;
        while(left <= right) {
            while(left <= right) {
                if(left <= right && nums[left] != val) {
                    left++;
                }else {
                    count--;
                }
            }
            while(left <= right) {
                if(left <= right && nums[right] == val) {
                    right--;
                    count--;
                }
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return count;
    }

    public static void main2(String args[]) {
        int i = 7;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);
    }
    /*public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null) {
            return false;
        }
        for(int i = 0; i <magazine.length(); i++) {
            for(int j = i; j < magazine.length(); j++) {
                if(magazine.substring(i,j).equals(ransomNote)){
                    return true;
                }
            }
        }
        return false;

    }*/

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0 && magazine.length() == 0) {
            return true;
        }
        if(magazine == null || ransomNote == null) {
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            if(!map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i),1);
            }else {
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            if(!map.containsKey(ransomNote.charAt(i))) {
                return false;
            }else{
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
                if(map.get(ransomNote.charAt(i)) == 0){
                    map.remove(ransomNote.charAt(i));
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {//2
        System.out.println("value="+switchit(4));//3
    }//4
    public static int switchit(int x) {
        int j=1;
        switch (x) {
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
    public static int lengthOfLastWord1(String s) {
        String[] str = s.split(" ");
        if(str.length == 0) {
            return 0;
        }
        return str.length-1;
    }

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if(str.length == 0) {
            return 0;
        }
        return str[str.length-1].length();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int count = 0;
        while(i <= m && j <= n) {
            if(nums1[i] > nums2[j]){
                arr[count] = nums2[j];
                count++;
                j++;
            }else {
                arr[count] = nums1[i];
                count++;
                i++;
            }
        }
        System.arraycopy(arr,0,nums1,0,count);
    }


    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }else {
                map.put(nums[i], map.get(nums[i])+1);
                return false;
            }
        }
        return true;
    }


}
