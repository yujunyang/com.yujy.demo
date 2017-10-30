package com.yujy.chat.client;

import com.yujy.chat.client.handler.ChatClientHandler;
import com.yujy.chat.protocol.IMDecoder;
import com.yujy.chat.protocol.IMEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;


/**
 * Created by Administrator on 2017/9/19.
 */
public class ChatClient {


    private ChatClientHandler clientHandler;
    private String host;
    private int port;

    public ChatClient(String nickName){

        this.clientHandler =new  ChatClientHandler(nickName);
    }

    public void connect(String host,int port){
        this.host = host;
        this.port = port;

        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.SO_KEEPALIVE,true);
            b.handler(new ChannelInitializer<SocketChannel>() {
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new IMDecoder());
                    socketChannel.pipeline().addLast(new IMEncoder());
                    socketChannel.pipeline().addLast(clientHandler);

                }
            });
            ChannelFuture future = b.connect(this.host,this.port).sync();
            future.channel().closeFuture().sync();
        }catch (InterruptedException e){
                e.printStackTrace();
        }finally{
                workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        new ChatClient("wangyuying").connect("127.0.0.1",80);
    }
}


