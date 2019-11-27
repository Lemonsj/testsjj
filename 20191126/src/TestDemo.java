public class TestDemo {
    public static void main(String[] args) {
        //final int a;
        Person person = new Person();
        person.setName("wangchenyi");
        String name = person.getName();
        person.setAge(21);
        int age = person.getAge();
        //person.show();
        System.out.println(person);


    }
    /*public static void main(String[] args) {
        String str = "la23456";
        int count = str.length()-1;

        while( count > 0) {
            if(str.charAt(count) >= 0 && str.charAt(count) <=9) {
                count--;
            }
        }
        if(count == 0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }*/

    public static void main1(String[] args) {
        //public native String intern();C/C++实现
        String str = "abcdef";
        String str2 = new String("abcdef").intern();
        char[] array1 = {'a','b','c','d'};
        String str3 = new String(array1);
        //String str3 = "abc" + "def";
        char[] array = str.toCharArray();
    }


}
