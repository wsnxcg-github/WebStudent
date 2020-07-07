package com.chen.springbootssm.controller;

import com.chen.springbootssm.pojo.Student;
import com.chen.springbootssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author chenjing
 * @create 2020-07-07 12:50
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/home.do")
    public ModelAndView StudentAll(){
        ModelAndView mv=new ModelAndView();
        List<Student> studentAll = studentService.getStudentAll();
        mv.addObject("stus",studentAll);
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping("/toAddStuPage.do")
    public String addstudentPage(){
        return "add_stu";
    }
    @RequestMapping("/addStu.do")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:home.do";
    }

    @RequestMapping("/updateStuPage.do")
    public String updateStudentPage(String id, HttpServletRequest req){
        Student student = studentService.getStudent(Integer.parseInt(id));
        req.getSession().setAttribute("student",student);
        return "update_stu";
    }


    @RequestMapping("/updateStu.do")
    public String updateStudent(Student student,HttpSession session){
        Student student1 = (Student) session.getAttribute("student");
        student.setId(student1.getId());
        studentService.updateStudent(student);
        return "redirect:home.do";
    }
    @RequestMapping("/deleteStu.do")
    public String deleteStudent(String id){
        studentService.deleteStudent(Integer.parseInt(id));
        return "redirect:home.do";
    }
}
