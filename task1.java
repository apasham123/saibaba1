package program1;

import static org.junit.Assert.*;

import org.junit.Test;

public class task1 {

	@Test
	public void test() {
	  program1 ob=new program1();
	  int result=ob.add(100, 200);
	  assertEquals(300,result);
	}

}
