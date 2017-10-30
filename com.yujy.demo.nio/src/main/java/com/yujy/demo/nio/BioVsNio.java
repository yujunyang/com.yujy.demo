package com.yujy.demo.nio;

import sun.applet.Main;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Administrator on 2017/9/4.
 * 参考：
 * https://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=2651478970&idx=1&sn=995321473129b47365a8de6c29b0e360&chksm=bd2537c58a52bed33d50e87799c6acbcf8bc05e93f5eac6e280319a97a7eeace5dec2a28b6b4&mpshare=1&scene=23&srcid=0903hk93FqOjlhIh2Iu2wUe9#rd
 *
 */
public class BioVsNio {

    private  static String patch = "D:/soft/Tomcat/apache-tomcat-8.0.9/logs/localhost_access_log.2017-09-03.txt";
    public static void BioBufferedInputStreamMethod(){
        InputStream in = null;
        try {

            in = new BufferedInputStream(new FileInputStream(patch));

            byte[] buff = new byte[1024];

            int index = in.read(buff);

            while (index != -1){
                for (int i = 0; i < index; i++){
                    System.out.println((char) buff[i]);
                }
               index = in.read(buff);
            }

        }catch (IOException e){

            e.printStackTrace();
        }finally {

            if (in!=null){
                try {
                    in.close();
                }catch (IOException e){


                }

            }
        }
    }

    public static void nioFileChannelMethod(){

        RandomAccessFile randomAccessFile = null;

        try {
            randomAccessFile = new RandomAccessFile(patch,"rw");
            FileChannel channel= randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            int index = channel.read(buffer);

            while (index != -1){
                buffer.flip();

                while (buffer.hasRemaining()){
                    System.out.println((char) buffer.get());

                }

                //压紧，压实 或调用 clear()方法
                buffer.compact();
                index = channel.read(buffer);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {

            try {
                if (randomAccessFile != null){
                    randomAccessFile.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }


    public static void main(String[] args) {

        //BioBufferedInputStreamMethod();

        //nioFileChannelMethod();
    }


}
