package se.lexicon.simon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pen object = context.getBean("myPenService", Pen.class);

        System.out.println(object.getDescription());


    }
}
