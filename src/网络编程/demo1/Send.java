package 网络编程.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
发送端
 */
public class Send {
    public static void main(String[] args) throws IOException {
        //
        Socket s = new Socket("100.114.158.29",10000);
        //
        OutputStream os = s.getOutputStream();
        byte[] bytes = "hello tcp".getBytes();
        os.write(bytes);

//        //接收反馈
//        InputStream is = s.getInputStream();
//        byte[] bytes1 = new byte[1024];
//        int len = -1;
//        if((len = is.read(bytes1))!=-1){
//            String s1 = new String(bytes, 0, len);
//            System.out.println(s1);
//        }
//接收反馈
        InputStream is = s.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len = is.read(bytes1);
        String data = new String(bytes1,0,len);
        System.out.println(data);
        s.close();
    }
}
