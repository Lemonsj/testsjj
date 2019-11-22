package com.bit.demo1;

public class Bird extends Animal{
    //public String name;
    public String further;
    static {
        System.out.println("Bird --> static");
    }
    {
        System.out.println("Bird -- > instance");
    }

    public Bird(String name,String further) {
        super(name);
        // this.name = name;
        this.further = further;
        System.out.println("String() String()");
    }
    public void fly() {
        System.out.println(this.name + " fly()");
    }
}
