package 字节流;
/*
未使用缓冲
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\镜音.jpg");
        FileOutputStream fos = new FileOutputStream("jingyin.jpg");

        byte[] bytes = new byte[1024];
        int len =-1;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
