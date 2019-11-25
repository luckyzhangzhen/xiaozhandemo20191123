import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class CourseSessionTest extends TestCase {
    @Test
    public void testCreate() {
        CourseSession courseSession = new CourseSession("English", "101");
        assertEquals("English", courseSession.getDepartment());
        assertEquals("101", courseSession.getNumber());
        assertEquals(0, courseSession.getNumberOfStudents());

    }
    @Test
    public void testEnrollStudents(){
        CourseSession coursesession=new CourseSession("English","101");
        Student firstStudent=new Student("zhangsan");
        coursesession.enroll(firstStudent);
        assertEquals(1,coursesession.getNumberOfStudents());
        ArrayList<Student> allStudents=coursesession.getAllStudents();
        assertEquals(1,allStudents.size());
        assertEquals(firstStudent,allStudents.get(0));

        Student secondStudent=new Student("lisi");
        coursesession.enroll(secondStudent);
        assertEquals(2,coursesession.getNumberOfStudents());
        assertEquals(2,allStudents.size());
        assertEquals(secondStudent,allStudents.get(1));


    }

}
