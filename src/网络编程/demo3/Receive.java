package 网络编程.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
控制台输入，一直发送，直到发送888停止
 */
public class Receive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        //读取数据
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        isr.close();
        s.close();
    }
}
