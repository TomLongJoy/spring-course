package com.zlj.ba01;


import org.springframework.stereotype.Component;

/**
 * @Component 创建对象的，等同于<bean>的功能
 * 属性：value及时对象的名称，也就是bean的id值，
 * value的值是唯一的，创建的对象在整个spring容器中就一个。
 * 位置：在类的上面，
 * @Component(value = "myStudent")
 * <bean id="myStudent" class="com.zlj.ba01.Student"></bean>
 *
 * spring中和@Component功能一致，创建对象的注解还有：
 * 1.@Repository（用在持久层类的上面）:放在dao的实现类上面，
 *                                表示创建dao对象，dao对象是能访问数据库的。
 * 2.@Service(用在业务层类的上面）：放在service的实现类上面，
 *                              创建service对象，service对象是做业务处理，可以有事务等功能的。
 * 3.@Controller（控制器上面）：放在控制器（处理器）类的上面，创建控制器对象的，控制器：接受用户提交数据，显示请求的处理结果。
 *
 * 这3个注解使用和@Component一样的，都能创建对象，但是这3个注解还有额外的功能
 *
 * @Repository、@Service、@Controller是给项目的对象分层的。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

//@Component(value = "myStudent")//1.第一种写法

@Component("myStudent") //2.省略value

//@Component //3.不指定对象名称，由spring提供默认名称:类名的首字母小写
public class Student {

    public Student() {
        System.out.println("student的无参构造");
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
