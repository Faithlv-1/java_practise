package 同步锁.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class myrun implements Runnable{
    public int ticket = 100;
    public Lock lock = new ReentrantLock();

//    //lock 锁方式
//    @Override
//    public void run() {
//        while (true){
//            try {
//                lock.lock();
//                if(ticket>0){
//                    System.out.println(Thread.currentThread().getName()+"卖"+ticket);
//                    ticket--;
//                }
//            }
//            finally {
//                lock.unlock();
//            }
//
//        }
//    }

    //锁代码块
    public void run() {
        while (true){
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖" + ticket);
                    ticket--;
                }
            }
        }
    }
}
