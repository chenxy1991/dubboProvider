package com.cxy.Test;

import com.alibaba.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by admin on 2017/12/6.
 */
/*@SpringBootApplication
@ImportResource({"classpath:services.xml"})*/
public class Test {

    private static Logger log = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "/META-INF/spring/application-provider.xml" });
        ac.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SpringApplication.run(Application.class, args);
        //}
    }
}
