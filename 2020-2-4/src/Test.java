import java.util.LinkedList;
import java.util.Queue;

class Person {
    public int age;
    public String name;
    public String sex;

    /*public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }*/
    public static final int count = 99;
}
class While {
    public void loop() {
        int x= 10;
        while ( x > 0 ) {
            System.out.print("x minus one is " + (x - 1));
            x -= 1;
        }
    }
}
public class Test {
    public static void main2(String[] args) {
        //int x;
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(person.name);
        //System.out.println(x);
        /*person.eat();
        person.sleep();
        Person person2 = new Person();*/
    }
    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main3 (String args[]) {
        Test t = new Test();

    }
    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        char[] str = s.toCharArray();
        int count = 0;
        int left = 0;
        int right = str.length-1;
        while(left < right) {
            char tmp = str[right];
            str[right] = str[left];
            str[left] = tmp;
            left++;
            right--;
        }
        int i = 0;
        for(i = 0; i < str.length; i++) {
            if(str[i] != ' ') {
                count++;
            }else if(str[i] == ' ' && count != 0) {
                return count;
            }
        }
        return count;
    }

    //🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        Queue<Integer> queue = new LinkedList<>();

    }
    public static void main(String[] args) {
        /*String str = "h ";
        int ret = lengthOfLastWord(str);
        System.out.println(ret);*/
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {0,2,4,6,8};
        merge(nums1, 5, nums2, 5);
    }
}
