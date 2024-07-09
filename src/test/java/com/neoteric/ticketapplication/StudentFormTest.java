package com.neoteric.ticketapplication;

import com.neoteric.ticketapplication.model.Address;
import com.neoteric.ticketapplication.model.Admission;
import com.neoteric.ticketapplication.model.Student;
import com.neoteric.ticketapplication.service.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentFormTest {
    @Test
    public void getStudentAgeGreaterThanSix() {

        Student student=new Student();

        student.firstName="A";
        student.age=7;
        student.standard="6";


        Address address=new Address();
        address.flatNo="408";
        address.area="kphb";
        address.street="kphb";
        address.city="hyd";
        address.pinCode="408";
        student.address=address;

        StudentService service=new StudentService();
        Admission admission=service.getAdmission(student);
        Assertions.assertEquals(1000,admission.fee);
        Assertions.assertNotNull(admission.rollNumber);


    }
    @Test
    public void test1() {

        Student student = new Student();
       student.age=5;
       student.standard="6" ;




        Address address = new Address();
        address.flatNo = "408";
        address.area = "kphb";
        address.street = "kphb";
        address.city = "hyd";
        address.pinCode = "408";
       student .address = address;

        StudentService service = new StudentService();
        Admission admission = service.getAdmission(student);
        Assertions.assertNull(admission);
    }
}

