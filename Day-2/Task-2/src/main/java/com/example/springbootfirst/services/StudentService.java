package com.example.springbootfirst.services;


import com.example.springbootfirst.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> studentDetails = new ArrayList<>(
            Arrays.asList(new Student("Jerlin", 20, "23CB021", "9014718812"), new Student("Nithya", 19, "23CB038", "8984739490"))
    );

    public List<Student> getStudentDetails(){
        return studentDetails;
    }

    public String studentName(){
        return "Student name is : Jerlin";
    }

    public String studentAge(){
        return "Student Age is : 20";
    }

    public String studentMobileNumber(){
        return "Student Mobile Number is : 9014718812";
    }
}
