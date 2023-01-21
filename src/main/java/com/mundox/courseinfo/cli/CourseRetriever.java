package com.mundox.courseinfo.cli;

import com.mundox.courseinfo.cli.service.CourseRetrieverService;
import com.mundox.courseinfo.cli.service.PluralsightCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CourseRetriever {

    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);

    public static void main(String[] args) {
        LOG.info("CourseRetriever starting");
        if (args.length == 0 ) {
            LOG.warn("Please provide an author name as first argument");
            return ;
        }
        try {
            retrieveCourses(args[0]);
        } catch (Exception e) {
            LOG.error("Unexpected error");
            e.printStackTrace();
        }
    }

    private static void retrieveCourses(String authorId) {
        LOG.info("Retrieving courses for author '{}'", authorId);
        CourseRetrieverService courseRetrieverService = new CourseRetrieverService();

        List<PluralsightCourse> coursesToStore = courseRetrieverService.getCoursesFor(authorId);
        LOG.info("Retrieved the following courses {}", coursesToStore);
    }
}
