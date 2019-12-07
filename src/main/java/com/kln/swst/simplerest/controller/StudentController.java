package com.kln.swst.simplerest.controller;

import com.kln.swst.simplerest.model.Student;
import org.apache.tomcat.util.http.fileupload.MultipartStream;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController{

    @RequestMapping(method = RequestMethod.GET)
    public Student get() throws IllegalArgumentException{
        Student student = new Student();
        student.setName("Panchni");


    }

}
