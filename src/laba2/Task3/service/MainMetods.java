package laba2.Task3.service;

import laba2.Task2.*;

public class MainMetods {
    protected University university;

    public Group getGroupByName(final String groupName) {
        for (final Group group : university.getGroups()) {
            if (group.getGroupName().equals(groupName)) {
                return group;
            }
        }
        return null;
    }

    public Student getStudentByName(final String studentName, final String groupName) {
        for (final Student student : getGroupByName(groupName).getStudents()) {
            if (student.getName().equals(studentName)) {
                return student;
            }
        }
        return null;
    }

    public Subject getSubjectByName(final String groupName, final String subjectName) {
        for (final Subject subject : getGroupByName(groupName).getSubjects()) {
            if (subject.getSubjectName().equals(subjectName)) {
                return subject;
            }
        }
        return null;
    }

    public MainMetods(final University university) {
        this.university = university;
    }
}
