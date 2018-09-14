package com.xjtu.train.repository;

import com.xjtu.train.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

    /**
     *
     * @param courseId
     * @return
     */
    Course findByCourseId(Long courseId);

    /**
     * select Course from course where Name = name
     * @param name
     * @return
     */
    Course findByName(String name);


}
