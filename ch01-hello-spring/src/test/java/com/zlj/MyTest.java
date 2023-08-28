package com.zlj;

import com.zlj.service.SomeService;
import com.zlj.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test01() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    /**
     * spring 默认创建对象的时间：在创建爱你spring的容器时，会创建配置文件中的所有的对象。
     * spring 创建对象，调用的是无参构造方法
     *
     * */
    @Test
    public void test02() {

        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");
        service.doSome();
    }

    /**
     * 获取spring容器中，java对象的信息
     *
     * */
    @Test
    public  void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用spring提供的方法, 获取容器中定义的对象的数量

        int nums = ac.getBeanDefinitionCount(); // optin + enter
        System.out.println("容器中定义的对象数量："+nums);
        //容器中每个定义的对象名称
        String[] namess = ac.getBeanDefinitionNames();
        for (String name :namess){
            System.out.println("容器中每个定义的对象名称"+name);
        }
    }

    // 获取一个非自定义的类对象
    @Test
    public  void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my =  (Date) ac.getBean("mydate");
        System.out.println("Date:"+my);
    }

}
