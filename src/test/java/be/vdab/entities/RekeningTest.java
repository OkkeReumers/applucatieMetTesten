package be.vdab.entities;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RekeningTest {
	private Rekening rekening;
	
	@Before 
	public void before() {
		rekening = new Rekening();
	}
	
	@Test
	public void hetSaldoVanEenNieuweRekeningIsNul() {
		assertEquals(0,BigDecimal.ZERO.compareTo(rekening.getSaldo()));
	}
	
	@Test
	public void hetSaldoVanEenRekeningMetEenStortingIsGelijkAanDieStorting() {
		BigDecimal bedrag = new BigDecimal("2.5");
		rekening.storten(bedrag);
		assertEquals(0, bedrag.compareTo(rekening.getSaldo()));
	}
	
	@Test
	public void hetSaldoVanEenRekeningMetTweeStortingenIsDeSomVanDieStortingen() {
		rekening.storten(new BigDecimal("5.0"));
		rekening.storten(new BigDecimal("7.5"));
		assertEquals(0, new BigDecimal ("12.5").compareTo(rekening.getSaldo()));	
	}

	@Test(expected = IllegalArgumentException.class)
	public void hetBedragVanEenStortingMagNietNulZijn(){
		rekening.storten(BigDecimal.ZERO);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void hetBedragVanEenStortingMagNietNegatiefZijn() {
		rekening.storten(new BigDecimal(-1));
	}
	
	@Test(expected = NullPointerException.class)
	public void hetBedragVanEenStortingMagNietNullZijn(){
		rekening.storten(null);
	}
}
