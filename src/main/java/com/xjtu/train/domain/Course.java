package com.xjtu.train.domain;

import javax.persistence.*;

/**
 * @author yangkuan
 * @date 2018/09/11
 */
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    Long courseId;

    @Column()
    String name;

    String teacherName;

    Integer studentNumber;


    public Course() {
    }

    public Course(String name, String teacherName, Integer studentNumber) {
        this.name = name;
        this.teacherName = teacherName;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", name='" + name + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }
}
