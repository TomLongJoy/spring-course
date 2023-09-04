package com.zlj.ba04;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySaaachool04")
public class School {

    @Value("北京大学")
    private String name;
    @Value("北京海淀区")
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
