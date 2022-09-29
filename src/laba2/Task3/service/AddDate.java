package laba2.Task3.service;

import laba2.Task2.*;

import java.time.LocalDate;

public class AddDate extends MainMetods{

    public AddDate(University university) {
        super(university);
    }

    public void addDate(final String groupName, final String subjectName, final LocalDate date) {
        getSubjectByName(groupName, subjectName).getDates().add(date);
    }

    public void addDate(final String groupName, final String subjectName, final String date) {
        addDate(groupName, subjectName, LocalDate.parse(date));
    }
}
