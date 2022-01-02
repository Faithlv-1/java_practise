package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        HashMap<String, String> HM1 = new HashMap<>();
        //多态
        Map<String, String> M1 = new HashMap<>();

        M1.put("url1","111");
        M1.put("url2","222");
        M1.put("url3","333");

        //根据键获取值
        System.out.println(M1.get("url1"));

        Set<String> keySet = M1.keySet();
        Collection<String> values = M1.values();
        for(String key:keySet){
            System.out.println(key);
        }
        for (String value:values){
            System.out.println(value);
        }
//        for()

    }
}
