import java.util.Scanner;

public class test {
    public static void unEncrypt(char result[], char password[]) {
        for(int i = 0; i < result.length; i++) {
            if(result[i] == 'Z') {
                password[i] = 'A';
            }
            if(result[i] == '0') {
                password[i] = '1';
            }
            if((result[i] >= 'A' && result[i] < 'Z') || (result[i] >= 0 && result[i] < 9)) {
                password[i] = (char)(result[i]-'0'+49);
            }
        }
    }
    public static int Encrypt(char result[], char password[]) {
        for(int i = 0; i < result.length; i++) {
            if(result[i] == 'A') {
                password[i] = 'Z';
            }
            if(result[i] == '1') {
                password[i] = '0';
            }
            if((result[i] >= 'A' && result[i] < 'Z') || (result[i] >= 0 && result[i] < 9)) {
                password[i] = (char)(result[i]-'0'+48);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            char[] ptr = str.toCharArray();
            char[] password = new char[ptr.length];
            unEncrypt(ptr,password);
        }
        /*char p = (char)65;
        System.out.println(p);*/
    }
}
