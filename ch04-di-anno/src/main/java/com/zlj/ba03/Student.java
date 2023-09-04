package com.zlj.ba03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component(value = "myStudent")//1.第一种写法

@Component("myStudent03") //2.省略value

//@Component //3.不指定对象名称，由spring提供默认名称:类名的首字母小写
public class Student {

    /**
     * @value：简单类型的属性赋值，
     * 属性：value 是string类型的，表示简单类型的属性值，
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *      2.在set方法的上面
     *
     * */
    @Value( "张飞")
    private String name;
    private Integer age;

    /**
     *  引用类型
     * @Atutowired:spring框架提供的注解，实现应用类型的赋值。
     *  spring 中通过注解给引用类型赋值，使用的是自动注入原力，支持byName,byType
     *
     * @Autowired:默认使用的byType自动注入。
     *
     * 位置：1）在属性定义的上面，无需set方法，推荐使用
     *      2） set方法的上面
     *
     * */
    @Autowired
    private  School school;

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
