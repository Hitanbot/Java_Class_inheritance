import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dave",987654321,15000.0);

    }

    @Test
    public void canGetNINumber(){
        assertEquals(987654321,databaseAdmin.getNINumber());
    }
    

    @Test
    public void canGetSalary(){
        Double target = 15000.0;
        assertEquals(target,databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.1);
        Double target = 16500.0;
        assertEquals( target ,databaseAdmin.getSalary());
    }

    @Test
    public void canGetBonus(){
        Double target = 150.0;
        assertEquals(target , databaseAdmin.payBonus());
    }

}
