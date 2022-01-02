package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
键值对遍历
 */
public class demo2 {
    public static void main(String[] args) {
        HashMap<String, String> M1 = new HashMap<>();

        M1.put("url1","111");
        M1.put("url2","222");
        M1.put("url3","333");

        Set<Map.Entry<String, String>> entries = M1.entrySet();

        for(Map.Entry<String, String> entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);

        }
    }
}
