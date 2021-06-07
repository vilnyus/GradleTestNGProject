import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {

    public Workers worker = null;

    @BeforeClass
    public void setUp(){
        worker = new Workers();
        worker.setAge(25);
        worker.setName("Pink", "Floyd");
    }

    @Test
    public void testWorker(){
        Assert.assertEquals(25, worker.getAge());
        Assert.assertEquals("Pink Floyd", worker.getName());
    }


}
