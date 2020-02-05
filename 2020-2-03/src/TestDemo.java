public class TestDemo {
    public static void main1(String[] args) {
        int i = 7;
        do{
            System.out.println(--i);
            --i;
        }while(i != 0);
        System.out.println(i);
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        char[] str1 = ransomNote.toCharArray();
        char[] str2 = magazine.toCharArray();
        if(str1.length > str2.length) {
            return false;
        }
        for(int i = 0; i < str1.length; i++) {
            int t = 0;
            while (str1[i] != str2[t]) {
                if (t == str2.length - 1) {
                    return false;
                }
                t++;
            }
            char tmp = str2[str2.length - 1];
            str2[str2.length - 1] = str2[t];
            str2[t] = tmp;
            str2 = new char[str2.length - 2];
        }
        return true;
    }
    public static void main(String[] args) {
        int result = 0;
        int i = 2;
        switch(i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
        }
        System.out.println(result);
    }
}
