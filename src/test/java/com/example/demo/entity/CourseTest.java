package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    @Test
    void makeTest(){
        Course course = new Course();
        course.setId(1);
        course.setCost(2.4);
        course.setDuration(3);
        course.setName("Course");
        assertEquals(course.getId(),1);
        assertEquals(course.getCost(),2.4);
        assertEquals(course.getDuration(),3);
        assertEquals(course.getName(),"Course");

    }
}
