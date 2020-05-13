import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-13
 * Time: 23:17
 **/
public class test {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sp = sc.nextLine().split("[^a-zA-Z]+");
        StringBuilder sb = new StringBuilder();
        for(int i = sp.length - 1; i >= 0; i--)
            sb.append(sp[i] + " ");
        System.out.println(sb.toString().trim());
        sc.close();
    }



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String input = scan.nextLine();
            // 第一步统一分隔符把只要不是字母的都换成空格
            char[] charArray = input.toCharArray();
            for(int i=0;i<charArray.length;i++){
                if(!isAlphaBelta(charArray[i])){
                    charArray[i]=' ';
                }
            }
            // 去掉两段的空格
            input=String.valueOf(charArray).trim();
            String[] split = input.split("\\s+");
            StringBuilder sb=new StringBuilder();
            int i;
            for( i=split.length-1;i>0;i--){
                sb.append(split[i]+" ");
            }
            sb.append(split[i]);
            System.out.println(sb.toString());
        }
    }
    public static boolean isAlphaBelta(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }

}
