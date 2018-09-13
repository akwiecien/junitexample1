uses org.junit.Test;
uses org.junit.Assert;

public class gosuClass_test {

  @Test
  public function constructor_is_generating_id_test(){
    //arrange and act
    var gc : gosuClass = new gosuClass();
    //assert
    Assert.assertNotNull(gc.GetId);
    Assert.assertEquals("Length of id is not 36",36,gc.GetId.length());
  }
}