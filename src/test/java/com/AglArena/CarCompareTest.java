package com.AglArena;

import org.testng.annotations.Test;

import com.ArenaPages.CarCompareElements;

public class CarCompareTest extends origin {
	 CarCompareElements mycompare= new CarCompareElements();
@Test
	public void carTest() throws InterruptedException{
 
  mycompare.compare();
	}
}
