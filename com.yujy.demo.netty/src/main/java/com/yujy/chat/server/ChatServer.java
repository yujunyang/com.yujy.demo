package com.yujy.chat.server;

import com.yujy.chat.client.ChatClient;
import com.yujy.chat.client.handler.ChatClientHandler;
import com.yujy.chat.protocol.IMDecoder;
import com.yujy.chat.protocol.IMEncoder;
import com.yujy.chat.server.handler.HttpHandler;
import com.yujy.chat.server.handler.SocketHandler;
import com.yujy.chat.server.handler.WebSockHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.apache.log4j.Logger;



/**
 * Created by Administrator on 2017/9/19.
 */
public class ChatServer {
    private static Logger LOG = Logger.getLogger(ChatServer.class);
    private int port=80;
    public void start(){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try{
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(bossGroup,workerGroup)
                    .channel(NioSctpServerChannel.class)
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        public void initChannel(SocketChannel socketHandler) throws Exception {

                            ChannelPipeline pipeline = socketHandler.pipeline();
                            /**解析自定义协议**/
                            pipeline.addLast(new IMDecoder());
                            pipeline.addLast(new IMEncoder());
                            pipeline.addLast(new SocketHandler());

                            /**解析Http请求**/
                            pipeline.addLast(new HttpServerCodec());

                            pipeline.addLast(new HttpObjectAggregator(64*1024));
                            pipeline.addLast(new ChunkedWriteHandler(

                            ));
                            pipeline.addLast(new HttpHandler());

                            /**解析webSocket请求**/
                            pipeline.addLast(new WebSocketServerProtocolHandler("/im"));

                            pipeline.addLast(new WebSockHandler());
                        }
                    });
            ChannelFuture future = bootstrap.bind(this.port).sync();
            LOG.info("服务已启动,监听端口" + this.port);
            future.channel().closeFuture().sync();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        new ChatServer().start();
    }


}
