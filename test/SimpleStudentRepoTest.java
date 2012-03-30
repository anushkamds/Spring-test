import junit.framework.Assert;
import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SimpleStudentRepoTest {
    private static Student s;
    private static SimpleStudentRepository r;
    public SimpleStudentRepoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        r=new SimpleStudentRepository();
        s=new Student();
        s.setFirstName("Anushka");
        s.setLastName("Mahesh");
        s.setAddress("ABC/DEF");
        s.setRegNumber(111111);
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
    public void testSaveStudent(){        
        r.saveStudent(s);
        System.out.println("Student is "+r.findStudent(s.getRegNumber()).getFirstName());
    }
    
    @Test
    public void testDeleteStudent(){
        r.deleteStudent(s);
        Assert.assertEquals("Null Expected",null,r.findStudent(s.getRegNumber()));
    }
    @Test
    public void testUpdateStudent(){
        s.setFirstName("ABCDEF");
        r.updateStudent(s);
        System.out.println("Student is "+r.findStudent(s.getRegNumber()).getFirstName());
    }

}
