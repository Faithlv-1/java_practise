package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();

        //
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes))!=-1){
            String datas = new String(bytes,0,len);
            System.out.println(datas);
        }

        //
        s.close();
        ss.close();
    }
}
