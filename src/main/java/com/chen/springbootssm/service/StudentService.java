package com.chen.springbootssm.service;

import com.chen.springbootssm.pojo.Student;

import java.util.List;

/**
 * @author chenjing
 * @create 2020-07-07 12:54
 */
public interface StudentService {
    public abstract List<Student> getStudentAll();
    public abstract int addStudent(Student student);
    public abstract Student getStudent(Integer id);
    public abstract int updateStudent(Student student);
    public abstract int deleteStudent(Integer id);
}
