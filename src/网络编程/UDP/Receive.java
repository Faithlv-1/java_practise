package 网络编程.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //Udp套接字
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
        int len =dp.getLength();
        System.out.println(new String(datas,0,len));

        //
        ds.close();
    }
}
