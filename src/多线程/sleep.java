package 多线程;

public class sleep {
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();
        Mythread m3 = new Mythread();

        //获取线程名
        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m3.getName());

        //设置线程名
        m1.setName("m1");
        m2.setName("m2");
        m3.setName("m3");

        //run
        m1.start();
        m2.start();
        m3.start();

    }
}
