package org.cse.springtute;

import org.springframework.context.support.*;

public class SmsStarter {

    public static void main(String[] args) {
        StudentManagementSystem sms;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-content.xml");
        context.start();
        Student stu=(Student)context.getBean("student1");
        Student stu2=(Student)context.getBean("student2");
        sms= (StudentManagementSystem)context.getBean("sms");
        sms.listAllStudents();
        sms.registerStudent(stu);
        sms.registerStudent(stu2);
        sms.listAllStudents();
    }
}
