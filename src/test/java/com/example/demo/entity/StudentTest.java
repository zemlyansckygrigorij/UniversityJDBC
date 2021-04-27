package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void makeTest(){
        Date date = new Date();
        Student student = new Student();
        student.setId(1);
        student.setAddress("Address");
        student.setBirthday(date);
        student.setGender(Gender.MALE);
        student.setMarried(false);
        student.setFirstName("Ivan");
        student.setSecondName("Ivanovich");
        student.setLastName("Ivanov");

        assertEquals(student.getId(),1);
        assertEquals(student.getAddress(),"Address");
        assertEquals(student.getGender(),Gender.MALE);
        assertEquals(student.getBirthday(),date);
        assertFalse(student.isMarried());
        assertEquals(student.getFirstName(),"Ivan");
        assertEquals(student.getSecondName(),"Ivanovich");
        assertEquals(student.getLastName(),"Ivanov");
    }


}