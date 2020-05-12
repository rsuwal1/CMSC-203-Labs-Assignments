

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m;
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		m = new ManagementCompany("Suwal's", "3324", 4, 0, 0, 100, 100);
		//student add three properties, with plots, to mgmt co
		m.addProperty("Kona", "Bethesda", 1550, "Rohan", 4, 4, 4, 4);
		m.addProperty("Mahuna", "Germantown", 1900,"Lana", 6, 10, 5, 5);
		m.addProperty("Lanai", "Frederick", 1750, "Jake", 11, 17, 4, 6);
	}

	@After
	public void tearDown() {
		//student set mgmt co to null
		m = null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		m.addProperty("A-Town", "first_ct", 200, "Rabin");
		//student should add property with 8 args
		m.addProperty("B-Town", "second_ct", 4012, "Kabin", 15, 21, 5, 7);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(m.addProperty("C-Town", "third_ct", 4490, "Beck", 50, 50, 1, 1), -1, 0);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		String maxRentString = m.maxRentProp().split("\n")[3];
		assertTrue(maxRentString.contains("1900.0"));
	}

	@Test
	public void testTotalRent() {
		assertEquals(m.totalRent(), 5200, 0);
	}

 }
