package com.mundox.courseinfo.server;

import com.mundox.courseinfo.domain.Course;
import com.mundox.courseinfo.repository.CourseRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Collectors;

@Path("/courses")
public class CourseResource {
    private static final Logger LOG = LoggerFactory.getLogger(CourseResource.class);

    private final CourseRepository courseRepository;

    public CourseResource(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @GET
    public String getCourses() {
        return courseRepository
                .getAllCourses()
                .stream()
                .map(Course::toString)
                .collect(Collectors.joining(", "));
    }
}