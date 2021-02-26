import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-26
 * Time: 20:59
 **/
public class Test {

    public static boolean isLongPressedName1(String name, String typed) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < name.length(); i++) {
            if(!map.containsKey(name.charAt(i))) {
                map.put(name.charAt(i),1);
            }else {
                map.put(name.charAt(i),map.get(name.charAt(i))+1);
            }
        }
        for(int i = 0; i < typed.length(); i++) {
            if(!map.containsKey(typed.charAt(i))) {
                return false;
            }else {
                map.put(name.charAt(i),map.get(name.charAt(i))-1);
            }
            if(typed.charAt(i) != typed.charAt(i+1)) {
                if(map.get(name.charAt(i)) > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

    public boolean isLongPressedName(String name, String typed) {

        if(name.length() > typed.length()){
            return false;
        }else{
            int i = 0;
            int j = 0;
            while( j <typed.length() ){
                if( i < name.length() && name.charAt(i) == typed.charAt(j) ){
                    i++;
                    j++;
                }else{
                    if( j>0 && j<typed.length() && typed.charAt(j)==typed.charAt(j-1) ){
                        j++;
                    }else{
                        return false;
                    }
                }
            }
            return i==name.length() && j==typed.length();
        }
    }
}
