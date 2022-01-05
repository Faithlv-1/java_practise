package 网络编程.demo2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        //
        InputStream is = s.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);

        //
        byte[] bytes = new byte[1024];
        int len = bis.read(bytes);
        System.out.println(len);


        //
        ss.close();


    }
}
