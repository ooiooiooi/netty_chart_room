package com.example.netty.Hander;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerInvoker;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;


public class NettyClientHandler extends SimpleChannelInboundHandler<String> {
    public static ChannelHandlerContext context = null;

    //利用写空闲发送心跳检测消息
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent e = (IdleStateEvent) evt;
            switch (e.state()) {
                case WRITER_IDLE:
//                    Message pingMsg=new Message(MsgType.PING);
//                    ctx.writeAndFlush(JSON.toJSON(pingMsg));
//                    System.out.println("send ping to server----------");
//                    break;

                default:
                    break;
            }
        }
    }

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg)
            throws Exception {
        System.out.println("______________________进入客户端处理逻辑____________________");
//        Message message = JSON.parseObject(msg+"", Message.class);
//        MsgType msgType=message.getType();
//        switch (msgType){
//            case LOGIN:{
//                //向服务器发起登录
//                message = new Message(MsgType.LOGIN);
//                ctx.writeAndFlush(JSON.toJSONString(message));
//            }break;
//            case PING:{
//                System.out.println("receive ping from server----------");
//            }break;
//            case SEND:{
//                //收到服务端消息
//                System.out.println("收到服务端消息："+message.getData());
//            }break;
//            case NO_TARGET:{
//                //收到服务端消息
//                System.out.println("找不到targetId:"+message.getTargetId());
//            }break;
//            default:break;
//        }
    }


}
