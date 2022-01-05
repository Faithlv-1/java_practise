package 网络编程.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();

        //正确
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String s1 = new String(bytes, 0, len);
        System.out.println(s1);

//        //错误死循环？
//        InputStream is = s.getInputStream();
//        byte[] bytes = new byte[1024];
//        int len= 0 ;
//        while ((len = is.read(bytes))!=-1){
//            String s1 = new String(bytes, 0, len);
//            System.out.println(s1);
//            break;
//        }

        //反馈给发送方
        OutputStream os = s.getOutputStream();
        byte[] bytes1 = "接收成功".getBytes();
        os.write(bytes1);

        s.close();
        ss.close();

    }
}
