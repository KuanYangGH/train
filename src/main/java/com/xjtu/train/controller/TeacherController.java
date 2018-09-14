package com.xjtu.train.controller;


import com.xjtu.train.dao.TeacherDao;
import com.xjtu.train.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/train")
public class TeacherController {
    @Autowired
    private TeacherDao teacherDao;

    @GetMapping("/saveTeacher")
    public List<Teacher> save(@RequestParam("name") String name,
                              @RequestParam("age") int age,
                              String major){
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher(name,age,major));
        return teacherDao.save(teachers);
    }
//
//    public List<Teacher> findByTeacherAge(int age){
//
//    }
}
