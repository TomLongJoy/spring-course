package com.zlj;

import com.zlj.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {

    @Test
    public  void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ctx.getBean("myStudent02");
        System.out.println("student="+student);



    }
}
