package xxx.yyy.zzz.config;

import org.springframework.context.annotation.Bean;
import xxx.yyy.zzz.bean.Teacher;

/**
 * xml配置和java 代码配置间的对应关系：
 *
 * 1. .xml 配置文件中有一个 <bean>...</bean> 的配置，对等的，配置类中就会有一个方法，且方法头上有 @Bean 注解。
 *
 * 2. .xml 配置文件中的 <bean> 配置，通过 class="..." 来说明这里（让 Spring）创建的是什么类型的对象；对等的
 *    配置类中，就是通过方法的返回值类型来说明这里（让Spring）创建的是什么类型的对象；
 *
 * 3. .xml 配置文件中的 <bean> 配置，通过 id="..." 来为这个单例的对象起一个唯一性编号，以和其他配置相区分；对等的
 *    配置类中，就是通过方法名来起到同样效果。
 *
 * 4.（代码配置的最大的灵活性和方便性，就体现在如下）
 *   .xml 配置文件中，我们是通过各种语法约定来【明示】/【暗示】 Spring
 *          应该以何种方式创建对象，（三种情况）
 *          以何种方式来为对象的属性赋值（两种情况）
 *          以何种方式来为对象的简单属性赋值，引用属性赋值。这些语法约定虽然不难，但是很繁琐。需要记忆（或临时查阅）。
 *   配置类中，上述问题，全部由程序员通过方法的代码自己实现。
 *          Spring 只保证它调用这个方法，且只调用一次，以实现获取并管理这个单利对象。
 *
 *  在 .xml 配置文件和 代码配置 两种配置方法中，背后的配置【思想】有一些小区别：
 *    .xml 配置文件的配置方式中，根据你所提供的【线索】，Spring 来 new 对象，来为其属性赋值。
 *    java 代码配置的配置方案中，由你【提前准备好】创建对象和为其属性赋值的代码（一个方法），
 *       Spring 就只用负责调动你的这个方法（且只调用一次）来获取这个单例对象。
 *
 * 所以，创建对象和为其属性赋值的工作就交到了程序员的手里，【你】想怎么搞，写代码就行。
 * 不再需要去【记】xml配置文件的语法规则，不用再【暗示】Spring应该怎么怎么干已达到你心里的预期效果。
 * 所以使用 java 代码配置的方式既变简单，又变灵活了。
 */
public class ApplicationContext {

    @Bean
    public Teacher xxx() {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("ben");

        return teacher;
    }
}
