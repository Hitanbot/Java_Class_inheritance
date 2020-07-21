import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave",987654321,15000.0,"Sales");

    }

    @Test
    public void canGetNINumber(){
        assertEquals(987654321,manager.getNINumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales",manager.getDeptName());
    }

    @Test
    public void canGetSalary(){
        Double target = 15000.0;
        assertEquals(target,manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.1);
        Double target = 16500.0;
        assertEquals( target ,manager.getSalary());
    }

    @Test
    public void canGetBonus(){
        Double target = 150.0;
        assertEquals(target , manager.payBonus());
    }

    @Test
    public void canSetName(){
        manager.setName("Rick");
        assertEquals("Rick" , manager.getName());
    }

    @Test
    public void cantSetNullName(){
        manager.setName(null);
        assertEquals("Dave" , manager.getName());
    }

    @Test
    public void cantRaiseNegativeSalary(){
        manager.raiseSalary(-1.1);
        Double target = 15000.0;
        assertEquals( target ,manager.getSalary());
    }

}
