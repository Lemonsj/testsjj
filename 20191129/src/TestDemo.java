/*import java.util.Scanner;

public class TestDemo {
    public static String func(String str) {
        String s = "def";
        return str + s;
    }
    public static void main(String[] args) {
        *//*
*/
/*SingleList singleList = new SingleList();
        singleList.addFirst(2);
        singleList.addFirst(1);
        singleList.addLast(3);
        singleList.addLast(2);
        singleList.addLast(1);
        singleList.display();
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
        System.out.println(singleList.is_huiwen());*//*
*/
/*

        Scanner scan = new Scanner(System.in);
        String ptr = scan.nextLine();
        String str = func(ptr);
        System.out.println(str);
    }
}*//*

import java.util.*;
import java.util.Scanner;
public class TestDemo{

    */
/*public static String func(String str) {
        //String s = "def";
        //return str + s;
        String[] strs = str.split(" ");
        String ret = " ";
        for(String str1 : strs) {
            ret += str1;
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ptr = scan.nextLine();
        String str = func(ptr);
        System.out.println(str);
    }*//*

    public static String reverse(String str) {
        char[] array = str.toCharArray();
        String ptr = "";
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            char tmp;
            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }

        return String.copyValueOf(array);
        //return Arrays.toString(array);
    }

    public static void main1(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str));
    }


}
*/
