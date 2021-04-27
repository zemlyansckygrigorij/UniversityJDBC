package com.example.demo.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @Test
    void makeTest(){
        Date date = new Date();
        Teacher teacher = new Teacher();
        teacher.setAddress("Address");
        teacher.setBiography("Biography");
        teacher.setBirthday(date);
        teacher.setFirstName("FirstName");
        teacher.setSecondName("SecondName");
        teacher.setId(1);
        teacher.setLastName("LastName");
        teacher.setQualification("Qualification");

        assertEquals(teacher.getAddress(),"Address");
        assertEquals(teacher.getBiography(),"Biography");
        assertEquals(teacher.getBirthday(),date);
        assertEquals(teacher.getFirstName(),"FirstName");
        assertEquals(teacher.getSecondName(),"SecondName");
        assertEquals(teacher.getId(),1);
        assertEquals(teacher.getLastName(),"LastName");
        assertEquals(teacher.getQualification(),"Qualification");

    }
}