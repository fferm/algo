/* COPYRIGHT (C) Fermitet AB, All rights reserved */

package se.fermitet.algo.model;

import org.joda.money.Money;
import org.joda.time.LocalDate;

public class Quote {
	private LocalDate date;
	
	public Quote() {
		super();
		this.date = LocalDate.now();
	}
	
	public LocalDate getDate() {
		return date;
	}

	public String getTicker() {
		// TODO Auto-generated method stub
		return null;
	}

	public Money getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
