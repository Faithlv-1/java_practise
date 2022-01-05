package 网络编程.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
1 创建套接字
2 获取输出流，写数据
3 释放资源
 */
public class Send {
    public static void main(String[] args) throws IOException {
        //
        Socket s = new Socket("100.114.158.29", 10000);

        //
        OutputStream os = s.getOutputStream();
        byte[] bytes = "hello TCP".getBytes();
        os.write(bytes);

        //
        s.close();
    }
}