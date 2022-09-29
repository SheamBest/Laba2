package laba2.Task3;

import laba2.Task2.*;
import laba2.Task3.service.*;

public class Task3 {
    public static void main(String[] args) {
        final University university = Task2.formingUniversity();

        final SortSubjectStudent sortSubjectStudent = new SortSubjectStudent(university);
        sortSubjectStudent.viewStudentsBySubject("PE");
        System.out.println();

        final SortAlphabetStudent sortAlphabetStudent = new SortAlphabetStudent(university);
        sortAlphabetStudent.viewGroupStudentsByName("KN-23");
        System.out.println();

        final AddSubject addSubject = new AddSubject(university);
        addSubject.addSubject("KN-23","Losing Lanes");
        System.out.println(university);

        final AddDate addDate = new AddDate(university);
        addDate.addDate("SA-41","Analysis of Systems","2022-09-23");
        System.out.println(university);
    }
}
