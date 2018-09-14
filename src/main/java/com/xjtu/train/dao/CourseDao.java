package com.xjtu.train.dao;


import com.xjtu.train.domain.Course;
import com.xjtu.train.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    CourseRepository courseRepository;


    public Course saveCourse(Course course){
        return courseRepository.save(course);
    }

    public List<Course> findCourses(){
        return courseRepository.findAll();
    }


    public Course findCourseById(Long courseId){
        return courseRepository.findByCourseId(courseId);
    }

}
