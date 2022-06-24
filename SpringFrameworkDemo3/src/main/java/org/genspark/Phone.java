package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Phone {

    private String mobile;

    //default constructor
    public Phone(){}

    public Phone(String mobile) {
        this.mobile = mobile;
    }

    public void init(){
        System.out.println("Phone init method.");
        setMobile("1234567890");
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
