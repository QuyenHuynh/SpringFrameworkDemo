package org.genspark;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student studentObj = (Student)context.getBean(Student.class);
        Phone phoneObj = (Phone)context.getBean(Phone.class);
        Address addressObj = (Address)context.getBean(Address.class);


        System.out.println(studentObj);
        System.out.println(phoneObj);
        System.out.println(addressObj);

        context.close();


    }
}
