package laba2.Task2;

import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;
    private List<Subject> subjects;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Group(final String groupName, final List<Student> students, final List<Subject> subjects) {
        this.groupName = groupName;
        this.students = students;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(groupName).append('\n');
        for (final Subject subject : subjects) {
            builder.append(subject).append('\n');
        }
        return builder.toString();
    }
}
