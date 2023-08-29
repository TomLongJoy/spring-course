package com.bjpowernode.ba03;

public class Student {

    private String name;
    private int age;

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
        System.out.println("spring  会调用类的无参数构造方法，创建对象");
    }

    //有参数构造方法
    public Student(String myName, int myAge, School mySchool) {
        System.out.println("Student类有参数构造方法=====");
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

}
