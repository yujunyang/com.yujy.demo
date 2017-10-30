package com.yujy.demo.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/9/4.
 */
public class nioClient
{

    private  static  void client(){
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        SocketChannel socketChannel = null;
        try {
            socketChannel  = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("localhost",8088));

            if (socketChannel.finishConnect()){
                int i = 0;
                while (true){
                    TimeUnit.SECONDS.sleep(1);
                    String info= "I'm"+(i++)+"-th information from client";
                    buffer.clear();
                    buffer.put(info.getBytes());
                    buffer.flip();
                    while (buffer.hasRemaining()){
                        System.out.println(buffer);
                        socketChannel.write(buffer);

                    }
                }
            }
        }catch (IOException e){

            e.printStackTrace();
        }catch (InterruptedException e){

            e.printStackTrace();
        }finally {
            try {
                if (socketChannel !=null){
                    socketChannel.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        client();
    }
}
