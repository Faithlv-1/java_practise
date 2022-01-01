package 基本类型转换;

import java.lang.reflect.Type;

public class main {
    public static void main(String[] args) {
        int a=2;
        String b="767";

        //int to string
        String c = String.valueOf(a);
        System.out.println(c);
        System.out.println(c.getClass().toString());
        int d = Integer.parseInt(b);
        System.out.println(d);
    }
}
