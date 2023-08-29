
## ch02-di-xml: 在spring的配置文件中，给java对象的属性赋值。

###di : 依赖注入，表示创建对象，给属性赋值。
###di的实现语法2种：
1.在spring的配置文件中，使用标签和属性完成，叫做基于xml的di实现。

2.使用spring中的注解，完成属性赋值，叫做基于注解的id实现。
###di的语法分类：
1.set注入（设置注入）：spring调用类的set方法，在set方法可以实现属性的赋值。 80%左右使用

2. 构造注入，spring调用类的有参数构造方法，创建对象


### 使用单元测试
1.加入依赖

    junit

2.创建测试类

###基于注解的di,通过注解完成java对象的创建，属性赋值。
    使用注解的步骤
    
    1.加入maven的依赖 spring-context,在加入spring-context的同时，间接加入spring-aop的依赖，
        使用注解必须使用spring-aop依赖。
    2.在类中加入spring的注解（多个不同功能的注解）
    3.在spring的配置文件中，加入一个组件扫描器的标签，说明注解在你的项目中的位置
    
    学习的注解
    @Component
    @Respototy
    @Service
    @Controller
    @Value
    @Autowired
    @Resource