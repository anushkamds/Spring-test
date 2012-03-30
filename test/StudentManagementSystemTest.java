import org.cse.springtute.Student;
import org.cse.springtute.StudentManagementSystem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentManagementSystemTest {
    private static StudentManagementSystem sms;
    private static Student s;

    public StudentManagementSystemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        sms=new StudentManagementSystem();
        s=new Student(100000, "AAAA", "WWWW", "EEEEE");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testAddNewStudent(){
        sms.registerStudent(s);
        sms.listAllStudents();
    }

}
