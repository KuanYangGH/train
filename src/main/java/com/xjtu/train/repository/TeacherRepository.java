package com.xjtu.train.repository;

import com.xjtu.train.domain.Course;
import com.xjtu.train.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository <Teacher,Long>{
    /**
     * 根据年龄查询教师
     *
     * @param age 年龄
     * @return
     */
    List<Teacher> findByAge(int age);

    /**
     *
     * @param young
     * @param old
     * @return
     */
    @Query("SELECT t FROM Teacher t "+
            "WHERE t.age>?1 and t.age<=?2")
    List<Teacher> findByAges(Integer young,Integer old);

    @Query("select c from Teacher t,Course c where t.teacherId=?1 and t.name=c.teacherName")
    List<Course> findCoursesByTeacherId(Long teacherId);

}
