/**
 * Created with IntelliJ IDEA
 * Description:自己实现多态的代码
 * User: 孙洁
 * Date: 2020-10-27
 * Time: 16:58
 **/
class Shape{
    public void draw() {

    }
}
class cat extends Shape {

    @Override
    public void draw() {
        System.out.println("🐱");
    }
}
class flower extends Shape {

    @Override
    public void draw() {
        System.out.println("❀");
    }
}
class fish extends Shape {
    @Override
    public void draw() {
        System.out.println("🐟");
    }
}
public class Test {
    public static void main(String[] args) {
        Shape shape1 = new cat();
        Shape shape2 = new flower();
        Shape shape3 = new fish();

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
