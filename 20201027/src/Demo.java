/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-27
 * Time: 18:10
 **/


class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public int age;

    Money m = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person p = (Person)super.clone();
        p.m = (Money)this.m.clone();
        return p;

    }


}
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
        person2.m.money = 100;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
