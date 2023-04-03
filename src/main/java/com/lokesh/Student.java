package com.lokesh;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

//    if xml name and our variable name is different then use @XmlElement annotation
    @XmlElement(name = "firstName")
    private String firstname;

    private String lastName;
    private int id;

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
