package com.zlj.service.impl;

import com.zlj.service.SomeService;
import com.zlj.util.ServiceTools;


//https://www.bilibili.com/video/BV1nz4y1d7uy?p=43
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {

        ServiceTools.doLog();
        System.out.println("执行了方法doSome()");

        //方法最后，提交事务
        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {

        ServiceTools.doLog();
        System.out.println("执行了方法doOther()");
        ServiceTools.doTrans();
    }
}
