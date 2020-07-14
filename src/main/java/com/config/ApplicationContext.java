package com.config;

import com.bean.Teacher;
import org.springframework.context.annotation.Bean;


public class ApplicationContext {

    @Bean
    public Teacher xxx() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("ben");

        return teacher;
    }
}
