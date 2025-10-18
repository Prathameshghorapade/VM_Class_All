
import java.util.Comparator;

public class SortedByMarks implements Comparator<Student> {
    public int compare(Student var1, Student var2) {

        return Double.compare(var1.getMarks(), var2.getMarks());
    }
}