
import static org.junit.Assert.assertEquals;
import res.CountRez;

public class TestOper {
    @org.junit.Test
    public void testPlus()
    {
    CountRez count = new CountRez();
    int rez = count.calc(15, "+", 5);
    assertEquals(20, rez);
    }   
    
    @org.junit.Test
    public void testMnus()
    {
    CountRez count = new CountRez();
    int rez = count.calc(15, "-", 5);
    assertEquals(10, rez);
    }   
}
