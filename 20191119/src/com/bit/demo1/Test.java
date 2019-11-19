package com.bit.demo1;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("小白", "白色");
        cat.eat();
        Bird bird = new Bird("小豆", "粉色");
        bird.eat();
        bird.fly();
    }
}
