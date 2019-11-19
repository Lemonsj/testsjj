package com.bit.demo1;

public class Bird extends Animal{
    //public String name;
    public String further;

    public Bird(String name, String further) {
        //this.name = name;
        super(name);
        this.further = further;
    }

    public void fly() {
        System.out.println(this.name + "  fly()");
    }
}
