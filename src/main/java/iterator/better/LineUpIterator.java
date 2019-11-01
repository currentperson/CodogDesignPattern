package iterator.better;

import iterator.bad.Student;

import java.util.Iterator;

public class LineUpIterator implements Iterator<Student> {

    private StudentLineUp studentLineUp;
    private Integer totalCount;
    private Integer currentRow;
    private Integer currentCol;
    private Integer currentCount;

    public LineUpIterator(StudentLineUp studentLineUp) {
        this.studentLineUp = studentLineUp;
        this.totalCount = studentLineUp.getStudents()
                .stream().map(list -> list.size())
                .reduce(Integer::sum).get();
        this.currentRow = 0;
        this.currentCol = 0;
        this.currentCount = 0;
    }

    @Override
    public boolean hasNext() {
        return currentCount.compareTo(totalCount) < 0;
    }

    @Override
    public Student next() {
        if(!hasNext()) {
            throw new RuntimeException("没有下一个数据了");
        }
        if(studentLineUp.getStudents().get(currentRow).size() <= currentCol) {
            currentRow++;
            currentCol = 0;
        }
        currentCount++;
        return studentLineUp.getStudents().get(currentRow).get(currentCol++);
    }
}
