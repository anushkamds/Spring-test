package org.cse.springtute;

import java.util.*;

public class StudentManagementSystem {

    private StudentRepository repo;

    public StudentManagementSystem() {
        repo = new SimpleStudentRepository();
    }

    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void listAllStudents() {
        LinkedList<Student> tmp = (LinkedList) repo.findAllStudents();
        for (Student i : tmp) {
            System.out.println("Student :" + i.getFirstName());
        }
    }

    public void registerStudent(Student stu) {
        repo.saveStudent(stu);
    }
}
