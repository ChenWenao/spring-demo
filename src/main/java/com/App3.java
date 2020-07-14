package com;

import com.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class App3 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext container =
            new AnnotationConfigApplicationContext(ApplicationContext.class);

        Teacher teacher = container.getBean(Teacher.class);
        System.out.println(teacher);

        container.close();
    }
}
