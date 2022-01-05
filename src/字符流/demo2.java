package 字符流;
/*
InputStreamReader
OutputStreamReader
 */
import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis);


        FileOutputStream fos = new FileOutputStream("a'.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
            System.out.println(chars);
        }
        isr.close();
        osw.close();
    }
}
