package bean;

import com.bean.Student;

public class StudentFactory {

    public com.bean.Student newStudent() {
        System.out.println("StudentFactory.newStudent()");
        return new Student();
    }
}
