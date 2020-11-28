import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-28
 * Time: 15:17
 **/

class Person {
    private String name;
    private String classes;
    private double Score;

    public Person(String name,String classes,double Score){
        this.name = name;
        this.classes = classes;
        this.Score = Score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", Score=" + Score +
                '}';
    }
}
public class Test {

    public static void main1(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("谢怜","1801",600));
        list.add(new Person("花城","1801",666));

        System.out.println(list);
    }

    public static void main3(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(2);
        System.out.println(stack);

        Scanner scan = new Scanner(System.in);
        //int A-B = scan.nextInt();

        int A = 0;
        //System.out.println(A + " " + B + ' ' + C);
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int M = scan.nextInt();//M = A-B;
            int N = scan.nextInt();//N = B-C;
            int E = scan.nextInt();//E = A+B;
            int F = scan.nextInt();//F = B+C;

            //A = M+B; B = A-M; B = N+C; C = B-N;
            //A = E-B; B = E-A; B = F-C; C = F-B;
            //2A = M+E; 2B = E-M; 2C = F-N;

            int A = 0;
            int B = 0;
            int C = 0;
            for(A = -30; A <= 30; A++) {
                for(B = -30; B <= 30; B++) {
                    for(C = -30; C <= 30; C++) {
                        if(2*A == (M+E) && 2*B == E-M && 2*C == F-N) {
                            System.out.println(A + " " + B + " " + C);
                        }
                    }
                }
            }
            if(A > 31 || B > 31 || C > 31) {
                System.out.println("No");
            }
        }
    }


    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String ptr = scan.nextLine();
            String[] arr = ptr.split(" ");
            int[] array = new int[arr.length];
            for(int i = 0; i < arr.length; i++) {
                array[i] = Integer.parseInt(arr[i]);
            }

            Arrays.sort(array);
            System.out.println(array[array.length/2]);
            /*int tmp = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i < array.length; i++) {
                if(!map.containsKey(array[i])) {
                    map.put(array[i], tmp);
                }else {
                    map.put(array[i], ++tmp);
                }
            }
            for(int i = 0; i < map.size(); i++) {
                if(map.)
            }*/
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String ptr = scan.nextLine();
            String[] arr = ptr.split(" ");
            List<Integer> list = new ArrayList<>();
            //int[] array = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                list.add(Integer.parseInt(arr[i]));
            }


            for (int i = 0; i < list.size(); i++) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }
                if(count >= list.size()/2) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }
    }
}
