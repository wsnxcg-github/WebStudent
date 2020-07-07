package com.chen.springbootssm.service.impl;

import com.chen.springbootssm.mapper.StudentMapper;
import com.chen.springbootssm.pojo.Student;
import com.chen.springbootssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenjing
 * @create 2020-07-07 12:54
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentAll() {
        return studentMapper.selectByExample(null);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Student getStudent(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int deleteStudent(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }
}
