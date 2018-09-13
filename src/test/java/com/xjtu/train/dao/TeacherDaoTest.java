package com.xjtu.train.dao;

import com.xjtu.train.domain.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherDaoTest {

    @Autowired
    private TeacherDao teacherDao;


    @Test
    public void save() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Liujun",44,"cs"));
    }

    @Test
    public void findByTeacherAge() {
    }

    @Test
    public void findAmongTeacherAges() {
    }

    @Test
    public void findCoursesByTeacherId() {
    }
}