package iterator.better;

import iterator.bad.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    /*public static void main(String[] args) {
        List<List<Student>> students = new ArrayList<>(15);
        for (int i = 0; i < 10; i++) {
            students.add(Arrays.asList(
                    new Student("朱坚强" + i, true),
                    new Student("兰兰" + i, false),
                    new Student("codog编程狗" + i, true)));
        }
        LineUpIterator lineUpIterator = new LineUpIterator(new StudentLineUp(students));
        while (lineUpIterator.hasNext()) {
            System.out.println(lineUpIterator.next().getName());
        }
    }*/

    public static void main(String[] args) {
        List<List<Student>> students = new ArrayList<>(15);
        for (int i = 0; i < 10; i++) {
            students.add(Arrays.asList(
                    new Student("朱坚强" + i, true),
                    new Student("兰兰" + i, false),
                    new Student("codog编程狗" + i, true)));
        }
        for (Student student : new StudentLineUp(students)) {
            System.out.println(student.getName());
        }
    }
}
