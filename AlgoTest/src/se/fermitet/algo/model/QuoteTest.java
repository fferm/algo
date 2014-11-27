/* COPYRIGHT (C) Fermitet AB, All rights reserved */

package se.fermitet.algo.model;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

public class QuoteTest {
	@Test
	public void defaultsForNewObjects() {
		Quote quote = new Quote();
		assertNotNull(quote);

		assertEquals("Date today", LocalDate.now(), quote.getDate());
		assertNull("Price", quote.getPrice());
		assertNull("Ticker", quote.getTicker());
	}
	
}
