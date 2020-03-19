import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            if(num > 1000) {
                num = 999;
            }
            List list = new ArrayList<>();
            for(int i = 0; i < num; i++) {
                list.add(i);
            }
            int i = 0;
            while(list.size() > 1) {
                i = (i + 2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
