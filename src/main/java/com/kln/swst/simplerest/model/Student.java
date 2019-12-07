package com.kln.swst.simplerest.model;

import org.apache.logging.log4j.util.Strings;
import org.apache.tomcat.util.http.fileupload.MultipartStream;

public class Student {
    private String name;
    private String address;
    private int age;

    public Strings getName() {
        return name;
    }

    public void setName(Strings name) {
        this.name = name;
    }

    public Strings getAddress() {
        return address;
    }

    public void setAddress(Strings address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if(age >100 || age <=0){
            throw new IllegalArgumentException("Invlid age");
        }
        this.age = age;
    }
}
