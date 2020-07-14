
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xxx.yyy.zzz.bean.Student;


public class App2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext container
                = new ClassPathXmlApplicationContext("applicationContext-2.xml");

        Student tom = container.getBean(Student.class);
        System.out.println(tom);

        container.close();
    }
}
