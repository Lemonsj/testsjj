/*import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;
    public Student(String name,int age,double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //return this.name.compareTo(o.name);
        //return (int)(this.score - o.score);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("chenyi",21,99.9);
        student[1] = new Student("buyi",10,78.9);
        student[2] = new Student("mubai",18,89.9);
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}*/

import java.util.Arrays;

class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //return this.name.compareTo(o.name);
        //return (int)(this.score - o.score);
    }

    public String name;
    public int age;
    public double score;
    public Student(String name,int age,double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("chenyi",21,99.8);
        student[1] = new Student("buyi",24,78.9);
        student[2] = new Student("mubai",18,88.9);
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}