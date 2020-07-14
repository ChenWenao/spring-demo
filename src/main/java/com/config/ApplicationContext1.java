package com.config;

import com.bean.Student;
import com.bean.Teacher;
import org.springframework.context.annotation.Bean;

public class ApplicationContext1 {

    @Bean
    public Teacher teacher() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("ben");
        return teacher;
    }

    /**
     * Spring 会发现这个方法需要传入一个 Teacher 对象。
     * 即，逻辑上要求：在调用该方法之前，Spring IoC 容器中要【先存在】一个 Teacher（的单例）对象。
     * Spring 会确保先调用上面这个 teacher() 方法，获得 Teacher 的单例对象，
     * 然后再调用下面这个 student() 传入【现在已存在了的】Teacher 对象，以获得 Student 单例对象。
     *
     * 简而言之，Spring 会发现/知道 Student 单例对象的创建【依赖于】Teacher 单例对象的创建，
     * 它会控制/管理创建这些对象的先后顺序。
     */
    @Bean
    public Student student(Teacher xxx) {
        Student student = new Student();
        student.setId(1);
        student.setName("tom");
        student.setAge(18);
        student.setTeacher(xxx);

        return student;
    }
}
