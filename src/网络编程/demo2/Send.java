package 网络编程.demo2;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Send {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("100.114.158.29",10000);

        //
        OutputStream os = s.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //
        byte[] bytes = "hello".getBytes();
        bos.write(bytes);

        s.close();
    }
}
