package com.mundox.courseinfo.repository;

import com.mundox.courseinfo.domain.Course;

import java.util.List;

public interface CourseRepository {
    void saveCourse(Course course);

    List<Course> getAllCourses();
}
