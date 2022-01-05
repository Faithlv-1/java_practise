package 多线程;
/*
优先jion线程

 */
public class jion {
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();
        Mythread m3 = new Mythread();

        //设置线程名
        m1.setName("m1");
        m2.setName("m2");
        m3.setName("m3");

        //m1之前的线程不受jion影响
        m2.start();
        m1.start();
        try {
            m1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m3.start();
    }
}
