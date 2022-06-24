package org.genspark;

public class Phone {

    private String mobile;

    //default constructor
    public Phone(){}

    public Phone(String mobile) {
        this.mobile = mobile;
    }

    public void init(){
        System.out.println("Phone init method.");
    }

    public void destroy(){
        System.out.println("Phone destroy method.");
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mobile='" + mobile + '\'' +
                '}';
    }
}
