package org.genspark;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> phone;
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
