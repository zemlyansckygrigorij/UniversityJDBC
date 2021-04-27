package com.example.demo.entity;

import java.util.Date;
import java.util.Objects;

public class Student {
    private long id;
    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
    private String address;
    private boolean married;
    private Gender gender;

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
