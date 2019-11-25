import junit.framework.*;
import org.junit.Test;

public class StudentTest extends TestCase {

    @Test
    public void testGetName() {
        Student student = new Student("zhangsan");
        assertEquals("zhangsan", student.getName());
    }
}
