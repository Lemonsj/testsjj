package com.bit.demo1;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + "  eat()");
    }
}
