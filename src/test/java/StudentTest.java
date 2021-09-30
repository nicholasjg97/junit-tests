import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {

    Student nico;

    @Before
    public void setUp(){
        nico = new Student("Nico", 123456);
    }

    @Test
    public void testGetName(){
        assertEquals("Nico", nico.getName());
    }

    @Test
    public void testGetID(){
        assertEquals(123456, nico.getId());
    }

    @Test
    public void testAddGrade(){
        nico.addGrade(100);
        nico.addGrade(80);
        assertTrue(100 == nico.getGrades().get(0));
        assertTrue(80 == nico.getGrades().get(1));
    }

    @Test
    public void testGradeAverage(){
        nico.addGrade(100);
        nico.addGrade(80);
        assertEquals(90, nico.getGradeAverage(), .1);
    }





}
