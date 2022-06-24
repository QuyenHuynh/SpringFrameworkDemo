package org.genspark;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student studentObj = (Student)context.getBean("Student");
        Phone phoneObj = (Phone)context.getBean("Phone");
        Address addressObj = (Address)context.getBean("Address");


        System.out.println(studentObj);
        System.out.println(phoneObj);
        System.out.println(addressObj);

        context.close();
    }
}
