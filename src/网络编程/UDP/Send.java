package 网络编程.UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建套接字，不指定端口即选择任意可用端口
        DatagramSocket ds = new DatagramSocket();

        byte[] bytes = "hello".getBytes();
        InetAddress address = InetAddress.getByName("100.114.158.29");
        //
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,10000);
        ds.send(dp);

        //关闭
        ds.close();

    }
}
