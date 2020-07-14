package com.bean;

/**
 * 截至目前为止，Sutdent 的属性的类型都是简单类型：
 *  基本类型（比如int）、基本类型的包装类（比如Integer）、String。
 * 对于简单类型的属性的赋值，无论是构造方法赋值，还是 setter 赋值，用到的都是 value="..." 。
 */
public class Student {

    private Integer id;
    private String name;
    private Integer age;

    // 引用类型的属性（非简单类型属性）
    private Teacher teacher;

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
