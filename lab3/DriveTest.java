package lab3;

import static org.junit.Assert.*;
import org.junit.Test;

public class DriveTest {
	
	@Test
	public void test() {
		for(int i=100;i<143;i++) {
			Drive d = new Drive();
			Read r = new Read();
		assertEquals(r.Eresult(i),d.getResult(i));
		    d = null;
		    r = null;
		}
	}

}
