package com.shubham.controller;

import com.shubham.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    

    Student student1=new Student(1,"shubham shinde","male","Sambhajinagar");
    Student student2=new Student(2,"Rahul Rajput","male","Sambhajinagar");
    Student student3=new Student(3,"Mukesh Ambani","male","Mumbai");
    Student student4=new Student(4,"Narayan Murti","male","Pune");

    List<Student> students= Arrays.asList(student1,student2,student3,student4);



     @GetMapping("/students")
     public List<Student> getStudents(){
         return students;
     }

     @GetMapping("/csrf")
     public CsrfToken getCsrfToken(HttpServletRequest request){
         return (CsrfToken) request.getAttribute("_csrf");
     }

     @PostMapping("/students")
     public Student addStudent(@RequestBody  Student student){
         return student;
     }
     
}
