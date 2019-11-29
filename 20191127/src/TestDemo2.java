class Money implements Cloneable{
    double money = 12.5;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public String name;
    public Money m;
    public Person() {
        this.m = new Money();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        //return super.clone();
        Person per = (Person) super.clone();
        per.m = (Money)this.m.clone();
        return per;
    }
}
public class TestDemo2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        Person person2 = (Person)person.clone();
        person2.m.money = 99.9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
    /*public static void main1(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        person.name = "mubai";
        Person person2 = (Person)person.clone();
        System.out.println(person2.name);
    }*/























