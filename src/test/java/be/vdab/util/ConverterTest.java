package be.vdab.util;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;

public class ConverterTest {

	@Test
	public void eenInchIs2Punt54Centimeters() {
		Converter converter = new Converter();
		assertEquals(0,new BigDecimal("2.54").compareTo(converter.inchesNaarCentimeters(BigDecimal.ONE)));
		// one wordt gebruikt in de plaats van "1", met het verschil dat bij 1 telkens een nieuw object wordt gemaakt 
		// bij one wordt telkens naar het zelfde object one gerefereerd
	}
	
	@Test
	public void tweehonderdInchesIsVijfhounderdenachtCentimeters() {
		Converter converter = new Converter();
		assertEquals(0, new BigDecimal(508).compareTo(converter.inchesNaarCentimeters(new BigDecimal(200))));
	}
}
