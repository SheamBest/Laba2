package laba2.Task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Subject {
    private String subjectName;
    private Map<Student, Integer> studentMark;
    private List<LocalDate> dates;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(final String subjectName) {
        this.subjectName = subjectName;
    }

    public Map<Student, Integer> getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(final Map<Student, Integer> studentMark) {
        this.studentMark = studentMark;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(final List<LocalDate> dates) {
        this.dates = dates;
    }

    public Subject(final String subjectName, final Map<Student, Integer> studentMark, final List<LocalDate> dates) {
        this.subjectName = subjectName;
        this.studentMark = studentMark;
        this.dates = dates;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(subjectName).append(" marks:\n");
        for (final Map.Entry<Student, Integer> item : studentMark.entrySet()) {
            builder.append(item.getKey()).append(" = ").append(item.getValue()).append("/100").append('\n');
        }
        builder.append(subjectName).append(" meetings:\n");
        for (final LocalDate date : dates) {
            builder.append(date).append('\n');
        }
        return builder.toString();
    }
}
