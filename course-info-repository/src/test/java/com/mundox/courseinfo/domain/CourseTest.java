package com.mundox.courseinfo.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void createObjectValidationThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Course("","name",1, "url"));
        assertThrows(IllegalArgumentException.class, () -> new Course("id","",1, "url"));
        assertThrows(IllegalArgumentException.class, () -> new Course("id","name",1, ""));
    }
}
