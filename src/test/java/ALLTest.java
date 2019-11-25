import junit.framework.TestSuite;

import java.security.KeyRep;

public class ALLTest {
    public static TestSuite suite(){
        TestSuite suite=new TestSuite();
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(StudentTest.class);
        return suite;
    }


}
