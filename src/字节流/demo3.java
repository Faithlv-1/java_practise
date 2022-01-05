package 字节流;
/*
字符缓冲优化
 */
import java.io.*;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\MMD.mkv");
        FileOutputStream fos = new FileOutputStream("MMD.mkv");
        byte[] bytes = new byte[1024];
        int len;


//        //一次读取一个字节
//        long startime = System.currentTimeMillis();
//        while ((len = fis.read(bytes))!=-1){
//            fos.write(bytes,0,len);
//        }
//        long endtime = System.currentTimeMillis();
//        System.out.println(endtime-startime);

        //使用缓冲
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long startime = System.currentTimeMillis();
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-startime);
        //
        fos.close();
        fis.close();

    }
}
