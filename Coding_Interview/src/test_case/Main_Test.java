package test_case;

import static org.junit.Assert.*;

import org.junit.Test;

import coding.Coding;
import coding.IntToRoman;
import coding.MinimumSwipe;
import coding.Sort_Array;

public class Main_Test {

	@Test
	public void test() {
		IntToRoman code = new IntToRoman();
		Sort_Array s = new Sort_Array();
		MinimumSwipe m  = new MinimumSwipe();
		
		assertEquals("XLIX", code.integerToRoman(49));
		assertEquals("elppa", code.reverse("apple"));
	
		assertEquals("e:3", code.MaxChar("Hello there"));
		
		
		assertEquals(3,m.minimumSwipe(new int[] {4,3,1,2}));
	
		
		
		
	}

}
