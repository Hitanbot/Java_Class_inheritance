import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave",987654321,15000.0);

    }

    @Test
    public void canGetNINumber(){
        assertEquals(987654321,developer.getNINumber());
    }


    @Test
    public void canGetSalary(){
        Double target = 15000.0;
        assertEquals(target,developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.1);
        Double target = 16500.0;
        assertEquals( target ,developer.getSalary());
    }

    @Test
    public void canGetBonus(){
        Double target = 150.0;
        assertEquals(target , developer.payBonus());
    }

}
