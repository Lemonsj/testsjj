package com.bit.demo1;

public class Animal {
    public String name;
        static {
        System.out.println("Animal --> static");
    }
    {
        System.out.println("Animal -- > instance");
    }
    public Animal(String name) {
        this.name = name;
        System.out.println("String()");
    }
    public void eat() {
        System.out.println(this.name + "Animal ~ eat()");
    }
}
