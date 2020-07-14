package xxx.yyy.zzz.bean;

public class StudentFactory {

    public Student newStudent() {
        System.out.println("StudentFactory.newStudent()");
        return new Student();
    }
}
