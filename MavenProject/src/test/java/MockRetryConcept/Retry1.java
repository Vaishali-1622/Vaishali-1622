package MockRetryConcept;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Retry1  {
  @Test
  public void testcase1() {
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void testcase2() {
	  Assert.assertEquals(false, true);
  }
}
