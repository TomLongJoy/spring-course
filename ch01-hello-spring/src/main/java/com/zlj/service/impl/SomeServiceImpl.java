package com.zlj.service.impl;

import com.zlj.service.SomeService;

public class SomeServiceImpl implements SomeService {


    public SomeServiceImpl(){
        System.out.println("SomeServiceImpl的无参数构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("执行了方法");
    }
}
