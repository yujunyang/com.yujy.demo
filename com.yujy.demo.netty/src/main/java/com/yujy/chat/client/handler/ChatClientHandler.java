package com.yujy.chat.client.handler;

import com.yujy.chat.client.ChatClient;
import com.yujy.chat.protocol.IMMessage;
import com.yujy.chat.protocol.IMP;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Administrator on 2017/9/19.
 */
public class ChatClientHandler extends ChannelInboundHandlerAdapter{
    private  static Logger LOG = Logger.getLogger(ChatClientHandler.class);
    private ChannelHandlerContext ctx;
    private String nickName;

    public ChatClientHandler(String nickName){
        this.nickName = nickName;
    }

    /**启动客户端控制台*/
    private void  session() throws IOException{
       new Thread(){
            public  void  run(){
                LOG.info(nickName+",你好，请在控制台输入消息内容");
                IMMessage message = null;
                Scanner scanner = new Scanner(System.in);

                do {
                    if (scanner.hasNext()){
                        String input = scanner.nextLine();
                        if ("exit".equals(input)){
                            message = new IMMessage(IMP.LOGOUT.getName(),System.currentTimeMillis(),nickName);
                        }else{
                            message = new IMMessage(IMP.CHAT.getName(),System.currentTimeMillis(),nickName,input);
                        }

                    }

                }while(sendMsg(message));

                scanner.close();

            }
       }.start();
    }

    /***
     * 发送消息
     * @param msg
     * @return
     */
    private boolean sendMsg(IMMessage msg){
        ctx.channel().writeAndFlush(msg);
        LOG.info("已经发送至聊天面板，请继续输入");
        return  msg.getCmd().equals(IMP.LOGOUT)?false:true;
    }

    /**
     * 收到消息后调用
     * @param ctx
     * @param msg
     * @throws IOException
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx,Object msg) throws IOException{
        IMMessage message = (IMMessage) msg;
        LOG.info(message);
    }

    /**
     * 发生异常时调用
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx,Throwable cause){
        LOG.info("与服务器断开连接"+cause.getMessage());
        ctx.close();
    }




}