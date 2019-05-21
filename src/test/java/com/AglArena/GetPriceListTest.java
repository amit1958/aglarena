package com.AglArena;
import org.testng.annotations.Test;

import com.ArenaPages.PriceListElements;

public class GetPriceListTest extends origin
{
	PriceListElements price= new PriceListElements();
 
    @Test(invocationCount = 1)
    public void AltoPriceTest() throws InterruptedException
    {
      price.AltoPriceList();
    }
}
