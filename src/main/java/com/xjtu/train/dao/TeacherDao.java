package com.xjtu.train.dao;

import com.xjtu.train.domain.Course;
import com.xjtu.train.domain.Teacher;
import com.xjtu.train.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

@Repository
public class TeacherDao {


    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> save(List<Teacher> teachers){
        return teacherRepository.saveAll(teachers);
    }

    public List<Teacher> findByTeacherAge(int age){
        return teacherRepository.findByAge(age);
    }

    public List<Teacher> findAmongTeacherAges(int young,int old){
        return teacherRepository.findByAges(young,old);
    }

    public List<Course> findCoursesByTeacherId(Long teacherId){
        return teacherRepository.findCoursesByTeacherId(teacherId);
    }

}
