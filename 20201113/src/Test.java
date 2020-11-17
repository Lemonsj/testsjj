import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-13
 * Time: 21:01
 **/
class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("Animal" + this.name);
    }
}
class Bird extends Animal{


    public Bird(String name) {
        super(name);
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
}

public class Test{
    public static void main(String[] args) {
        Animal animal = new Bird("菲非");

    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //1,2,3,4,5,3,2,1
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int tmp = 0;
        for(int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])) {
                tmp = map.get(array[i]);
                tmp++;
                map.put(array[i],tmp);
            }else {
                map.put(array[i],1);
            }
        }
        int flag = 0;
        for(int i = 0; i < array.length; i++) {
            if(map.get(array[i]) == 1) {
                if(flag == 0) {
                    num1[0] = array[i];
                    flag = 1;
                }else {
                    num2[0] = array[i];
                }
            }
        }
    }
}

