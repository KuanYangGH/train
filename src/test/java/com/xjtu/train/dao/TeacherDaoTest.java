package com.xjtu.train.dao;

import com.xjtu.train.domain.Course;
import com.xjtu.train.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherDaoTest {

    @Autowired
    private TeacherDao teacherDao;

    @Test
    public void save(){
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Liujun",44,"cs"));
        teachers.add(new Teacher("Weibifan",35,"ee"));
        teachers.add(new Teacher("Zhaozhongmeng",52,"cs"));
        teachers.add(new Teacher("LinChang",48,"ee"));
        teacherDao.save(teachers);
    }

    @Test
    public void findByTeacherAge(){
        int age1 = 44;
        List<Teacher> result1 = teacherDao.findByTeacherAge(age1);
        Assert.assertEquals(3,result1.size());
    }
    @Test
    public void findAmongTeacherAges(){
        int young=30,old=50;
        List<Teacher> result2 = teacherDao.findAmongTeacherAges(young,old);
        Assert.assertEquals(3,result2.size());
    }
    @Test
    public void findCourseByTeacherId (){
        long teacherId1 = 1;
        List<Course> result3 = teacherDao.findCourseByTeacherId(teacherId1);
        Assert.assertEquals(1,result3.size());
    }

}
