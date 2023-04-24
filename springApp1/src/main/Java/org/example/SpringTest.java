package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBeans testBeans = context.getBean("testBeans", TestBeans.class);
        System.out.println(testBeans.getName());
        context.close();
    }
}
