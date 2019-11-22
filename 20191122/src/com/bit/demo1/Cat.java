package com.bit.demo1;

public class Cat extends Animal{
    //public String name;
    public String color;
    static {
        System.out.println("Cat --> static");
    }
    {
        System.out.println("Cat -- > instance");
    }


    public Cat(String name, String color) {
        super(name);
        // this.name = name;
        this.color = color;
        System.out.println("String() String()");
    }
    public void eat() {
        System.out.println(this.name + "Cat ~ eat()");
    }

}
