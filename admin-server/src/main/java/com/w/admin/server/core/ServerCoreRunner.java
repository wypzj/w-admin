package com.w.admin.server.core;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author wyp
 * @desc netty启动类
 * @date : 2021/11/5 17:48
 */
@Component
public class ServerCoreRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workGroup = new NioEventLoopGroup();
        ServerBootstrap serverBootstrap = new ServerBootstrap();

    }
}
