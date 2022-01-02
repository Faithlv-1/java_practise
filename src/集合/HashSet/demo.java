package 集合.HashSet;
/*
hashSet 练习
增强for
 */
import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
        Students s1 = new Students("111", 1);
        Students s2 = new Students("222", 2);
        Students s3 = new Students("333", 3);
        Students s4 = new Students("111", 1);

        HashSet<Students> h1 = new HashSet<>();

        h1.add(s1);
        h1.add(s2);
        h1.add(s3);
        h1.add(s4);

        for(Students s:h1){
            System.out.println(s.toString());
            System.out.println(s.hashCode());
        }

        String a1="山东";
        String a2="山东";
        String a3="北京";
        String a4="江苏";

        HashSet<String> h2 = new HashSet<>();

        h2.add(a1);
        h2.add(a2);
        h2.add(a3);
        h2.add(a4);

        for(String a:h2){
            System.out.println(a);
            System.out.println(a.hashCode());
        }

    }
}
