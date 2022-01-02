package 字节流;

import java.io.*;

/*
使用缓冲
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
//        long startime = System.currentTimeMillis();
//        method1();
//        long endtime = System.currentTimeMillis();
//        System.out.println(endtime-startime);

        long startime = System.currentTimeMillis();
        method2();
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-startime);

    }

    //采用缓冲
//    public static void method1() throws IOException {
//        FileInputStream fis = new FileInputStream("a.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
//        FileOutputStream fos = new FileOutputStream("a.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        byte[] bytes = new byte[1024];
//        int len =-1;
//        while ((len = fis.read(bytes))!=-1){
//            fos.write(bytes,0,len);
//            System.out.println(bytes);
//        }
//        fis.close();
//        fos.close();
//    }

    //不采用缓冲
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("a.txt");

        byte[] bytes = new byte[1024];
        System.out.println(fis.read());
        int len =-1;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
            System.out.println(bytes);
        }
        fis.close();
        fos.close();
    }
}
