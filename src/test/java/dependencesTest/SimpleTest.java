package dependencesTest;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleTest {
	
	static boolean a=false;
	 @BeforeClass 
	 public static void onlyOnce() {
		 a=true;
	       System.out.println(a);
	    }
	 
	@Test
	public void testSimple(){
		Assert.assertTrue(a);
		System.out.println("testSimple");
	}
	
	@Test
	public void testSimple2(){
		Assert.assertEquals(1,2);
		System.out.println("testSimple2");
	}
}
