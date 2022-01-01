package 自定义异常;

public class demo {
    public static void main(String[] args) {
        int[] a = {1,2,3};

        try {
            method(101);
        } catch (exced e) {
            e.printStackTrace();
        }
    }

    public static void method(int a)throws exced{
        if(a>100){
            throw new exced("大于100");
        }
        else {
            System.out.println(a);
        }
    }
}
