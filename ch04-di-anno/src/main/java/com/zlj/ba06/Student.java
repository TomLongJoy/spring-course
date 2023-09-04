package com.zlj.ba06;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@Component(value = "myStudent")//1.第一种写法

@Component("myStudent06") //2.省略value

//@Component //3.不指定对象名称，由spring提供默认名称:类名的首字母小写
public class Student {


    @Value("张飞")
    private String name;
    private Integer age;

    /**
     * 引用类型
     *
     * @Resource:来自jdk的注解，spring框架提供了对这个注解的支持，可以使用它给引用类型赋值，使用的也是自动注入，支持byName，byType（默认）。 位置：1.在属性定义的上面，无需set方法，推荐
     * 2.set方法上面
     */

    //默认byName ： 先是byName，如果失败使用byType
    @Resource
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student() {
        System.out.println("student02的无参构造");
    }

}
