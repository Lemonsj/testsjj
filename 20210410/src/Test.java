import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-10
 * Time: 14:52
 **/
public class Test {
    import java.util.*;


    public class Solution {
        /**
         *
         * @param strs string字符串一维数组
         * @param str1 string字符串
         * @param str2 string字符串
         * @return int整型
         */
        public int minDistance (String[] strs, String str1, String str2) {
            // write code here
            HashMap<String, Integer> map = new HashMap<>() ;
            if(str1 == null || str2 == null) {
                return -1;
            }
            for(int i = 0; i < strs.length; i++) {
                if(!(map.containsKey(strs[i]))) {
                    map.put(strs[i],i);
                }else {
                    if((strs[i].equals(str1) && !map.containsKey(str2)) ||
                            strs[i].equals(str2) && !map.containsKey(str1)) {
                        map.put(strs[i],map.get(strs[i]+1));
                    }else if(strs[i].equals(str1) && map.containsKey(str2)){
                        int tmp1 = Math.abs(map.get(str1) - map.get(str2));
                        int tmp2 = Math.abs(map.get(str2) - i);
                        if(tmp2 < tmp1) {
                            map.put(strs[i],map.get(strs[i]+1));
                        }
                    }else if(strs[i].equals(str2) && !map.containsKey(str1)){
                        int tmp1 = Math.abs(map.get(str1) - map.get(str2));
                        int tmp2 = Math.abs(map.get(str2) - i);
                        if(tmp2 < tmp1) {
                            map.put(strs[i],map.get(strs[i]+1));
                        }
                    }else {
                        continue;
                    }

                }
            }
            if(!map.containsKey(str1) || !map.containsKey(str2)) {
                return -1;
            }
            int minlen = Math.abs(map.get(str1) - map.get(str2));
            return minlen;
        }
    }
}
