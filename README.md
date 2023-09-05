# spring-course
 [learn from website ](https://www.bilibili.com/video/BV1nz4y1d7uy?p=44)
 


### 动态代理
    1.可以在程序的执行过程中，创建代理对象。
    2.通过代理对象执行方法，给目标类的方法增加额外的功能（功能增强）
    
    实现步骤：
    1.创建目标类，SomServiceImol目标类，给它的doSome,doOther增加输出时间，事务。
    2.创建InvocationHandler接口的实现类，在这个类实现给目标方法增加功能。
    3.使用jdk中的类，Proxy创建代理对象，实现代理对象的能力。

