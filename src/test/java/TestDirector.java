import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director("Dave",987654321,15000.0,"Sales",200000.0);

    }

    @Test
    public void canGetNINumber(){
        assertEquals(987654321,director.getNINumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales",director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        Double target = 200000.0;
        assertEquals(target,director.getBudget());
    }

    @Test
    public void canGetSalary(){
        Double target = 15000.0;
        assertEquals(target,director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.1);
        Double target = 16500.0;
        assertEquals( target ,director.getSalary());
    }

    @Test
    public void canGetBonus(){
        Double target = 300.0;
        assertEquals(target , director.payBonus());
    }

}
