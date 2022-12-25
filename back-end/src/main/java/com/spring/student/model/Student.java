package com.spring.student.model;

import com.spring.student.model.enums.Gender;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;
    @Column(name= "full_name")
    private String fullName;
    @Column(name= "phone_number")
    private String phone;
    @Enumerated(EnumType.STRING)
    @Column(name= "gender")
    private Gender gender;
    @Column(name= "age")
    private String age;
    @Column(name= "address")
    private String address;
    @CreationTimestamp
    @Column(name= "date_created")
    private Date dateCreated;
    @UpdateTimestamp
    @Column(name= "date_updated")
    private Date dateUpdated;
}
