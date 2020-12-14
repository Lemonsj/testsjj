import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-14
 * Time: 19:54
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int ret = LengthOfLongetSubstring(str);
            System.out.println(ret);
        }
    }
    //求无重复字符的最长子串
    public static int LengthOfLongetSubstring(String str) {
        int len = str.length();
        int count = 0;
        int start = 0;
        int end = 0;
        int ret = 0;
        HashSet<Character> set = new HashSet<>();
        while(start < len && end < len) {
            if(set.contains(str.charAt(end))) {
                set.remove(str.charAt(start++));
            }else {
                set.add(str.charAt(end++));
                ret = Math.max(ret,end-start);

            }
        }
        return ret;
    }

    public static double findMedianSortedArrays(int[] nums1,int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] array = new int[len];
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index1 < len1 && index2 < len2) {
            if(nums1[index1] <= nums2[index2]) {
                array[index] = nums1[index1];
                index1++;
            }else {
                array[index] = nums2[index2];
                index2++;
            }
            index++;
        }
        while(index1 < len1) {
            array[index] = nums1[index1];
            index1++;
            index++;
        }
        while(index2 < len2) {
            array[index] = nums2[index2];
            index2++;
            index++;
        }
        int mindIndex = (len1+len2)/2;
        if((len1+len2) % 2 == 0) {
            return (array[mindIndex-1] + array[mindIndex]) / 2.0;
        }else {
            return array[mindIndex];
        }
    }
}
