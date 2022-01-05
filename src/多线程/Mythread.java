package 多线程;

public class Mythread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(this.getName()+":"+i);
//            try {
//                this.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
