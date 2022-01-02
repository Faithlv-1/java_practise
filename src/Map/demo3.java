package Map;

import 集合.HashSet.Students;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
键值为自定义类
 */
public class demo3 {
    public static void main(String[] args) {
        Students s1 = new Students("李", 1);
        Students s2 = new Students("王", 2);
        Students s3 = new Students("阿", 3);

        HashMap<String, Students> M1 = new HashMap<>();

        M1.put("s1",s1);
        M1.put("s2",s2);
        M1.put("s3",s3);

        Set<Map.Entry<String, Students>> entries = M1.entrySet();
        for(Map.Entry<String, Students> entry:entries){
            String key = entry.getKey();
            Students value = entry.getValue();
            System.out.println(key+":"+value.toString());

        }
    }
}
