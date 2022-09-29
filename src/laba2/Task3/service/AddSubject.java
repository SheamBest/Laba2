package laba2.Task3.service;

import laba2.Task2.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddSubject extends MainMetods{
    protected University university;

    public AddSubject(University university) {
        super(university);
    }

    public void addSubject(final String groupName, final Subject subject) {
        getGroupByName(groupName).getSubjects().add(subject);

    }
    public void addSubject(final String groupName, final String subjectName) {
        final Group group = getGroupByName(groupName);
        final List<Student> students = group.getStudents();
        final Map<Student, Integer> map = new HashMap<>();
        for (final Student student : students) {
            map.put(student, 0);
        }
        final Subject subject = new Subject(subjectName, map, new ArrayList<>());
        addSubject(groupName, subject);
    }
}
