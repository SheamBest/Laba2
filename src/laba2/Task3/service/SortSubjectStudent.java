package laba2.Task3.service;

import laba2.Task2.*;

public class SortSubjectStudent extends MainMetods{
    public SortSubjectStudent(University university) {
        super(university);
    }
    public void viewStudentsBySubject(final String subjectName) {
        for (final Group group : university.getGroups()) {
            final Subject subject = getSubjectByName(group.getGroupName(), subjectName);
            subject.getStudentMark().keySet().forEach(System.out::println);
        }
    }
}
