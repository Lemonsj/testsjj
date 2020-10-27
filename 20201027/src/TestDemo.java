import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-27
 * Time: 17:06
 **/
class Student implements Comparable<Student> {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;

        if(this.age > o.age) {
            return 1;
        }else if(this.age == o.age) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("毛不易",26);
        Student student2 = new Student("王晨艺",22);

        /*if(student1.compareTo(student2) > 0) {
            System.out.println("毛不易比王晨艺大");
        }*/
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
