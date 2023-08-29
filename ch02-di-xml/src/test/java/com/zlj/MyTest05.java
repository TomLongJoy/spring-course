package com.zlj;


import com.bjpowernode.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {


    /**
     * spring 默认创建对象的时间：在创建爱你spring的容器时，会创建配置文件中的所有的对象。
     * spring 创建对象，调用的是无参构造方法
     *
     * */
    @Test
    public void test01() {

        String config = "ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("student对象="+myStudent);
    }



}
