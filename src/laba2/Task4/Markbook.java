package laba2.Task4;

import laba2.Task2.*;
import laba2.Task3.service.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Markbook {
    private University university;
    private Student student;
    private Map<String, Integer> mark;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    public Map<String, Integer> getMark() {
        return mark;
    }

    public void setMark(final Map<String, Integer> mark) {
        this.mark = mark;
    }

    public Markbook(final University university, final Student student,final Map<String, Integer> mark) {
        this.university = university;
        this.student = student;
        this.mark = mark;
    }

    public Markbook (final String student, final University university){
        this.university = university;
        final MainMetods mainMetods = new MainMetods(university);
        this.student = mainMetods.getStudentByName(student);
        this.mark = new HashMap<String, Integer>();
        for (final Group group : university.getGroups()) {
            if (group.getStudents().contains(this.student)) {
                for (final Subject subject : group.getSubjects()) {
                    mark.put(subject.getSubjectName(), subject.getStudentMark().get(this.student));
                }
            }
        }
    }
    public void changeMarkBySubjectName(final String subjectName, final Integer newValue) {
        mark.put(subjectName, newValue);
    }

    public static Map<String, Integer> getMarksByStudent(final University university, final String studentName) {
        final Markbook markbook = new Markbook(studentName, university);
        return markbook.getMark();
    }
    public static Map<Student, Map<String, Integer>> getAllMarksAllStudents(final University university) {
        final Map<Student, Map<String, Integer>> map = new HashMap<>();
        for (final Group group : university.getGroups()) {
            for (final Subject subject : group.getSubjects()) {
                for (final Map.Entry<Student, Integer> item : subject.getStudentMark().entrySet()) {
                    final Markbook markbook = new Markbook(item.getKey().getName(), university);
                    map.put(item.getKey(), markbook.getMark());
                }
            }
        }
        return map;
    }

    public static List<Integer> getMarksBySubject(final University university, final String subjectName) {
        final List<Integer> mark = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            for (final Subject subject : group.getSubjects()) {
                if (subject.getSubjectName().equals(subjectName)) {
                    mark.addAll(subject.getStudentMark().values());
                }
            }
        }
        return mark;
    }
}
