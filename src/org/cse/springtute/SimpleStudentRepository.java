package org.cse.springtute;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

    private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    @Override
    public void saveStudent(Student stu) {
        studentsDb.put(stu.getRegNumber(), stu);
    }

    @Override
    public void deleteStudent(Student stu) {
        studentsDb.remove(stu.getRegNumber());
    }

    @Override
    public Student findStudent(long regNumber) {
        return studentsDb.get(regNumber);
    }

    @Override
    public void updateStudent(Student stu) {
        if (studentsDb.containsKey(stu.getRegNumber())) {
            studentsDb.put(stu.getRegNumber(), stu);
        } else {
            studentsDb.put(stu.getRegNumber(), stu);
        }

    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> tmp=new LinkedList<Student>();
        for(long i:studentsDb.keySet()){
            tmp.add(studentsDb.get(i));
        }
        return tmp;
    }
}
