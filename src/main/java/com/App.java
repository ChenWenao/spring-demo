package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xxx.yyy.zzz.bean.Student;


public class App {

    public static void main(String[] args) {
        // 创建 Spring IoC 容器。该容器中有某些类的单例对象。
        ClassPathXmlApplicationContext container
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 先后向 Spring取两次 Student 对象。
        Student tom = container.getBean(Student.class);
        Student jerry = container.getBean(Student.class);
        System.out.println( tom == jerry ? "==" : "!=");

        Student ben = new Student();
        System.out.println( tom == ben ? "==" : "!=");
        container.close();
    }
}
