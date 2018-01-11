package com.cxy.UserServiceImp;

import com.alibaba.dubbo.rpc.RpcContext;
import com.cxy.UserService.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by admin on 2017/12/6.
 */
public class UserServiceImp implements UserService {
    private static Logger log = LoggerFactory.getLogger(UserServiceImp.class);

    public void sayHello() {
        boolean isProvider= RpcContext.getContext().isProviderSide();
        String clientIP = RpcContext.getContext().getRemoteHost();
        if(isProvider){
            log.info("当前运行的是提供者程序，调用方主机ip为"+clientIP);
        }
        System.out.println("hello world--------");
    }
}
