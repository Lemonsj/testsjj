import java.util.Arrays;

class Student implements Comparable<Student> {
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
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
class TestDemo1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("wangchenyi", 22, 99.9);
        students[1] = new Student("maobuyi", 25, 89.9);
        students[2] = new Student("wuqingfeng", 38, 79.9);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
