package edu.niptict.cs.g5.lms;

import java.util.Date;

/**
 * This class is used ...
 *
 * @author MAO Hieng, 12/13/2019
 **/
public class MutableStudent {

    private long id;
    private String name;
    private Date createdDate;

    public MutableStudent(long ssn, String name) {
        this.id = ssn;
        this.name = name;
        this.createdDate = new Date();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public static void main(String[] args) {
        MutableStudent student = new MutableStudent(1234567, "John");
        Date createdDate = student.getCreatedDate();
        createdDate.setTime(200000); // Now createdDate field is changed!
    }
}
