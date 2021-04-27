package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    @Test
    void makeTest(){
        Subject subject = new Subject();
        subject.setId(1);
        subject.setName("subject");
        subject.setDescription("Description");
        assertEquals(subject.getName(),"subject");
        assertEquals(subject.getId(),1);
        assertEquals(subject.getDescription(),"Description");

    }
}
/*    private long id;
    private String name;
    private String description ;*/