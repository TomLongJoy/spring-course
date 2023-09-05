package com.zlj;

import com.zlj.service.SomeService;
import com.zlj.service.impl.SomeServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SomeService service = new SomeServiceImpl();
        service.doOther();
        service.doSome();
    }
}
