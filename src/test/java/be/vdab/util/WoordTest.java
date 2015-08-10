package be.vdab.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {

	@Test
	public void lepelIsEenPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}
	
	@Test
	public void tafelIsGeenPalindroom() {
		assertFalse(new Woord("tafel").isPalindroom());
	}
	
	@Test
	public void eenLegeStringIsEenPalindroom() {
		assertTrue(new Woord("").isPalindroom());
	}
}
