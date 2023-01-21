package com.mundox.courseinfo.cli.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PluralsightCourseTest {

    @Test
    void durationInMinutes() {
        PluralsightCourse course = new PluralsightCourse("id", "Test course", "00:05:37", "url", false);
        assertEquals(5, course.durationInMinutes());
    }

    void durationInMinutesOverHour() {
        PluralsightCourse course = new PluralsightCourse("id", "Test course", "01:08:54.9613330", "url", false);
        assertEquals(68, course.durationInMinutes());
    }

    void durationInMinutesZero() {
        PluralsightCourse course = new PluralsightCourse("id", "Test course", "00:00:00", "url", false);
        assertEquals(68, course.durationInMinutes());
    }
}