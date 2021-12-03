package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerDemo {
	@Test
	public void sum() {
		Assert.assertEquals(5, 5);
	}
	
	@Test
	public void substraction() {
		Assert.assertEquals(4, 3);
	}
	
	@Test(enabled = false)
	public void skipTest() {
		
	}
}
