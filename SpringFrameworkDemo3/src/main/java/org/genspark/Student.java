package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int id;
    private String name;
    @Autowired
    private List<Phone> phone;
    @Autowired
    private Address address;

    //default constructor
    public Student(){}


    public Student(int id, String name, List<Phone> phone, Address address){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void init(){
        System.out.println("Student init method.");
        setId(0);
        setName("Quyen");
        setPhone(phone);
        setAddress(address);
    }

    public void destroy(){
        System.out.println("Student destroy method.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}
