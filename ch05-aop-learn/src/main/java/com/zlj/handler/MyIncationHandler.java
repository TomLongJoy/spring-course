package com.zlj.handler;

import com.zlj.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyIncationHandler implements InvocationHandler {


    private Object target;//目标对象 SomServiceImpl类

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("执行了 invokde()");
        System.out.println(method.getName());
        //通过代理对象执行方法时，会调用执行这个invoke（）；
        Object res = null;
        ServiceTools.doLog();
        //执行目标类的方法，通过Method类实现
        res = method.invoke(target, args);// SomeServiceImpl .doOther()  dosome();
        ServiceTools.doTrans();
        return res;
    }
}
