package laba2.Task4;

import laba2.Task2.Task2;
import laba2.Task2.University;

public class Task4 {
    public static void main(final String[] args) {
        final University university = Task2.formingUniversity();
        System.out.println(university);
        final Markbook markbook = new Markbook("Shen Masta", university);
        markbook.changeMarkBySubjectName("Analysis of Systems", 100);

        System.out.println("all marks all student = " + Markbook.getAllMarksAllStudents(university));
        System.out.println("all marks one student = " + Markbook.getMarksByStudent(university, "Leblanc Overpowered"));
        System.out.println("all marks one subject = " + Markbook.getMarksBySubject(university, "System Analysis"));
    }
}
