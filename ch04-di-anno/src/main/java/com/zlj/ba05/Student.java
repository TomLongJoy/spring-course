package com.zlj.ba05;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component(value = "myStudent")//1.第一种写法

@Component("myStudent04") //2.省略value

//@Component //3.不指定对象名称，由spring提供默认名称:类名的首字母小写
public class Student {


    @Value("张飞")
    private String name;
    private Integer age;

    /**
     * 引用类型
     *
     * @Atutowired:spring框架提供的注解，实现应用类型的赋值。 spring 中通过注解给引用类型赋值，使用的是自动注入原力，支持byName,byType
     * @Autowired:默认使用的byType自动注入。
     * @-- 位置：1）在属性定义的上面，无需set方法，推荐使用
     * 2） set方法的上面
     *
     * 属性：required 是一个booleanl类型，默认true，
     *  required = true，表示引用类型赋值失败，程序报错，终止执行
     *  required =  false，引用类型赋值失败，程序正常执行，
     * 如果使用 byName 方式需要做的是：
     * 1.在属性上面加入 @Autowired
     * 2.在属性上面加入@Qualifier(value="bean的id") ：表示使用指定名称的bean，完成赋值
     */
    @Autowired
    @Qualifier("mySaaachool05") //这里需要注意： mySaaachool04 需要同School类 @Component 的value一样。
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
