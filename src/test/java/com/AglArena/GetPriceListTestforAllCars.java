package com.AglArena;
import org.testng.annotations.Test;

import com.ArenaPages.PriceListElements;

public class GetPriceListTestforAllCars extends origin
{
	PriceListElements price= new PriceListElements();
 
    @Test
    public void AllCarsPriceTest() throws InterruptedException
    {
      price.AllCarsPriceTest();
    }
}
