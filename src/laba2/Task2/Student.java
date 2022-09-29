package laba2.Task2;

import java.util.Objects;

public class Student {
    private String name;
    private String speciality;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(final String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public Student(final String name, final String speciality, final String group) {
        this.name = name;
        this.speciality = speciality;
        this.group = group;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(speciality, student.speciality) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciality, group);
    }

    @Override
    public String toString() {
        return name + ", " + speciality + ", " + group;
    }
}
