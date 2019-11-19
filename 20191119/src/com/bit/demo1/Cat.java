package com.bit.demo1;

public class Cat extends Animal{
    //public String name;
    public String color;//子类所独有的

    public Cat(String name, String color) {
        super(name);//显示的调用父类的构造方法--》帮助父类来进行构造
        this.name = name;
        this.color = color;
    }

    /*public void eat() {
        System.out.println(this.name + "  eat()");
    }*/
}
