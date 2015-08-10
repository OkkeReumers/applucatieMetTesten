package be.vdab.valueobjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	private Veiling  veiling;
	
	@Before
	public void before(){
		veiling = new Veiling();
	}
	
	@Test
	public void hetHoogsteBodVanEenNieuweVeilingStaatOpNul() {
		assertEquals(0, veiling.getHoogsteBod());
	}

	@Test
	public void naEenEersteBodIsHetHoogsteBodGelijkAanHetBedragVanDitBod() {
		veiling.doeBod(100);
		assertEquals(100, veiling.getHoogsteBod());
	}
	
	@Test
	public void naMeerdereBiedingenIsHetHoogsteBodGelijkAanHetBedragVanDitBod() {
		veiling.doeBod(100);
		veiling.doeBod(200);
		veiling.doeBod(150);
		assertEquals(200, veiling.getHoogsteBod());
	}
}
