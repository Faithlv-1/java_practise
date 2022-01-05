package 字符流;

import java.io.*;

/*
缓冲优化
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars))!=-1){
            bw.write(chars,0,len);

        }

        br.close();
        bw.close();
    }
}
