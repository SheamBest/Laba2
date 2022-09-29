package laba2.Task3.service;

import laba2.Task2.*;

import java.util.Comparator;
import java.util.List;

public class SortAlphabetStudent extends MainMetods{
    public SortAlphabetStudent(University university) {
        super(university);
    }

    public void viewGroupStudentsByName(final String groupName) {
        final List<Student> students = getGroupByName(groupName).getStudents();
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);
    }
}
