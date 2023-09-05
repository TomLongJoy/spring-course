package com.zlj;

import com.zlj.handler.MyIncationHandler;
import com.zlj.service.SomeService;
import com.zlj.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.doOther();
//        service.doSome();


        //使用jdk的proxy创建代理对象

        //创建爱你目标对象
        SomeService target = new SomeServiceImpl();
        //创建
        InvocationHandler handler = new MyIncationHandler(target);
        //使用Proxy
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        //通过代理执行方法，
        proxy.doSome();
    }
}
