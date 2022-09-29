package laba2.Task2;

import java.util.Objects;

public class Student {
    private String name;
    private String speciality;
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

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

    public Student(final String name, final String speciality, final Group group) {
        this.name = name;
        this.speciality = speciality;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        if (getSpeciality() != null ? !getSpeciality().equals(student.getSpeciality()) : student.getSpeciality() != null)
            return false;
        return getGroup() != null ? getGroup().equals(student.getGroup()) : student.getGroup() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSpeciality() != null ? getSpeciality().hashCode() : 0);
        result = 31 * result + (getGroup() != null ? getGroup().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", group=" + group.getGroupName() +
                '}';
    }
}
