package iterator.better;

import iterator.bad.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
public class StudentLineUp implements Iterable<Student> {
    private List<List<Student>> students;

    @Override
    public Iterator<Student> iterator() {
        return new LineUpIterator(this);
    }
}
