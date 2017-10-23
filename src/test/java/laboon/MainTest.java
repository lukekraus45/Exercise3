import org.junit.Test;
import static org.junit.Assert.*;
import laboon.Main;

public class MainTest{
	
	
	@Test
	public void testTri5(){
			assertEquals(Main.tri(5), 15);
	}
	
	@Test
	public void testTri10(){
		assertEquals(Main.tri(10), 55);
	}
	
	@Test
	public void testTri1(){
		assertEquals(Main.tri(1), 1);
	}
	
	
	@Test
	public void testLazy5(){
		assertEquals(Main.lazy(5), 16);
	}

	@Test
	public void testLazy10(){
		assertEquals(Main.lazy(10), 56);
	}
	
	@Test
	public void testLazy500(){
		assertEquals(Main.lazy(500), 125251);
	}
	
}