package laba2.Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static University formingUniversity() {

        final List<Group> groups = new ArrayList<>();
        final String groupName1 = "KN-23";
        final String speciality1 = "Computer science";
        final List<Student> students1 = Stream.of(
                new Student("Afford Stuzhuk", speciality1, groupName1),
                new Student("Kariman Aliev", speciality1, groupName1),
                new Student("Akhor Rousvelt", speciality1, groupName1)
        ).collect(Collectors.toList());
        groups.add(new Group(groupName1, students1, Stream.of(
                new Subject("TIMS", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 90);
                    put(students1.get(1), 56);
                    put(students1.get(2), 73);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 7),
                        LocalDate.of(2022, 9, 9),
                        LocalDate.of(2022, 9, 14),
                        LocalDate.of(2022, 9, 16),
                        LocalDate.of(2022, 9, 21)
                ).collect(Collectors.toList())
                ),
                new Subject("English for Programmers", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 88);
                    put(students1.get(1), 50);
                    put(students1.get(2), 79);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 8),
                        LocalDate.of(2022, 9, 9),
                        LocalDate.of(2022, 9, 14)
                ).collect(Collectors.toList())),
                new Subject("PE", new HashMap<Student, Integer>(){{
                    put(students1.get(0), 100);
                    put(students1.get(1), 100);
                    put(students1.get(2), 100);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 9)
                ).collect(Collectors.toList())
                )
        ).collect(Collectors.toList())
        ));

        final String groupName2 = "SA-41";
        final String speciality2 = "System Analysis";
        final List<Student> students2 = Stream.of(
                new Student("Leblanc Overpowered", speciality2, groupName2),
                new Student("Shen Masta", speciality2, groupName2),
                new Student("Jungle Diff", speciality2, groupName2)
        ).collect(Collectors.toList());
        groups.add(new Group(groupName2, students2, Stream.of(
                new Subject("System Analysis", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 99);
                    put(students2.get(1), 57);
                    put(students2.get(2), 84);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 2),
                        LocalDate.of(2022, 9, 12)
                ).collect(Collectors.toList())
                ),
                new Subject("Analysis of Systems", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 100);
                    put(students2.get(1), 100);
                    put(students2.get(2), 100);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 3),
                        LocalDate.of(2022, 9, 5),
                        LocalDate.of(2022, 9, 5),
                        LocalDate.of(2022, 9, 8)
                ).collect(Collectors.toList())),
                new Subject("PE", new HashMap<Student, Integer>(){{
                    put(students2.get(0), 100);
                    put(students2.get(1), 100);
                    put(students2.get(2), 100);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 9),
                        LocalDate.of(2022, 9, 16),
                        LocalDate.of(2022, 9, 23)
                ).collect(Collectors.toList()))
        ).collect(Collectors.toList())
        ));
        return new University("National University of Quebec", groups);
    }

    public static void main(final String[] args) {
            final University university = formingUniversity();
            System.out.println(university);
    }
}
