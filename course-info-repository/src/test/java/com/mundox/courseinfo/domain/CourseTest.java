package com.mundox.courseinfo.domain;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {

    @Test
    public void createObjectValidationThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new Course("","name",1, "url", Optional.empty()));
        assertThrows(IllegalArgumentException.class, () -> new Course("id","",1, "url", Optional.empty()));
        assertThrows(IllegalArgumentException.class, () -> new Course("id","name",1, "", Optional.empty()));
    }

    @Test
    void rejectBlankNotes() {
        assertThrows(IllegalArgumentException.class, () ->
                new Course("1", "title", 1, "url", Optional.of("")));
    }
}
