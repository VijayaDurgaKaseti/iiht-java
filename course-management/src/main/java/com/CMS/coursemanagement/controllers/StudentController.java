package com.CMS.coursemanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CMS.coursemanagement.dao.studentRepository;
import com.CMS.coursemanagement.models.Student;


@Controller
@RequestMapping("/student")
public class StudentController {
@Autowired
private studentRepository studentRepository;
@RequestMapping(value="/",method=RequestMethod.GET)
 public String studentLogin() {
return "studentlogin";

}
@RequestMapping(value="studentregister",method = RequestMethod.GET)
public String  studentRegister(Model model) {
model.addAttribute("student",new Student());
return "studentregister";
}

@RequestMapping(value="/studentRegProcess",method = RequestMethod.POST)
 public String addStudentRegister(@ModelAttribute("studentlogin") Student st) {
 
 
 Student s= studentRepository.save(st);
 
 if(s!=null)
 {
 return "studentlogin";
 }
 else
 {
 return "index";
 
 }
}
}
