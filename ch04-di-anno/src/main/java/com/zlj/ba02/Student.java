package com.zlj.ba02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component(value = "myStudent")//1.第一种写法

@Component("myStudent02") //2.省略value

//@Component //3.不指定对象名称，由spring提供默认名称:类名的首字母小写
public class Student {

    /**
     * @value：简单类型的属性赋值，
     * 属性：value 是string类型的，表示简单类型的属性值，
     * 位置：1.在属性定义的上面，无需set方法，推荐使用
     *      2.在set方法的上面
     *
     * */
    @Value(value = "张飞")
    private String name;

    @Value(value = "32")
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
        System.out.println("student02的无参构造");
    }

}
