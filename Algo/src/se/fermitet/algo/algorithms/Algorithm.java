/* COPYRIGHT (C) Fermitet AB, All rights reserved */

package se.fermitet.algo.algorithms;

public interface Algorithm {
	public void setUp();
	
	public void onNewDay();
	public void onMarketEvent();
}
