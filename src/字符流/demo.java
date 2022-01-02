package 字符流;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("jingyin.jpg");
        InputStreamReader isr = new InputStreamReader(fis);
        FileOutputStream fos = new FileOutputStream("jingyin.jpg");
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        char[] chars = new char[1024];
        int len=-1;
        while ((len = isr.read(chars))!=-1){
            osw.write(chars);
        }

    }
}
