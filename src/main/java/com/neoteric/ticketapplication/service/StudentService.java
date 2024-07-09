package com.neoteric.ticketapplication.service;

import com.neoteric.ticketapplication.model.Admission;
import com.neoteric.ticketapplication.model.Student;

import java.util.UUID;

public class StudentService {
    public Admission getAdmission(Student venkat){
        Admission admission = null;
        if (venkat.age >6){
            admission = new Admission();
            admission.rollNumber = "TG" + UUID.randomUUID().toString();
            admission.fee=1000;
            admission.standard=venkat.standard;

        }
        return admission;
    }
}
