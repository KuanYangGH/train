package com.xjtu.train.dao;

import com.xjtu.train.domain.Course;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseDaoTest {

    @Autowired
    CourseDao courseDao;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void saveCourse() {
        Course course = new Course("编译原理","Liujun",54);
        Course result = courseDao.saveCourse(course);
        Assert.assertEquals(course,result);
    }

    @Test
    public void findCourses() {
        List<Course> results = courseDao.findCourses();
        logger.info(results.toString());
        if(results.size()!=3){
            logger.error("shujuku");
        }
        Assert.assertEquals(1,results.size());
    }

    @Test
    public void findCourseById() {
        Long courseId = 1L;
        Course result = courseDao.findCourseById(courseId);
        //logger.info(result.toString());
        Assert.assertNotNull(result);
        Assert.assertEquals("编译原理",result.getName());
    }

    @Test
    public void saveCourse1() {
    }

    @Test
    public void findCourseById1() {
    }
}