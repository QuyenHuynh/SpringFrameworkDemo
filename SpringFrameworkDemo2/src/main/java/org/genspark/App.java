package org.genspark;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student studentObj = (Student)context.getBean("student");
        Phone phoneObj = (Phone)context.getBean("phone");
        Address addressObj = (Address)context.getBean("address");


        System.out.println(studentObj);
        System.out.println(phoneObj);
        System.out.println(addressObj);

        context.close();

    }
}
