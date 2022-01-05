package 网络编程.demo3;

import java.io.*;
import java.lang.invoke.VarHandle;
import java.net.Socket;

public class Send {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("100.114.158.29",10000);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
        BufferedWriter bw = new BufferedWriter(osw);

        String line;
        while ((line = br.readLine())!=null){
            //若等于888
            if(line.equals("888"))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();
    }
}
