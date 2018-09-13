import org.junit.Assert;
import org.junit.Test;

public class javaClass_test {

    @Test
    public void constructor_is_generating_id(){
        //arrange and act
        javaClass jc = new javaClass();
        //assert
        Assert.assertNotNull(jc.GetId());
        Assert.assertEquals(36,jc.GetId().length());
    }

}
