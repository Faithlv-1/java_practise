package 同步锁.lock;

public class demo {
    public static void main(String[] args) {
        myrun my = new myrun();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);
        Thread t3 = new Thread(my);

        t1.start();
        t2.start();
        t3.start();
    }
}
