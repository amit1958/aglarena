package com.AglArena;
import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ArenaPages.MSTAElements;

public class MSTAFormTest extends origin
{
	MSTAElements header= new MSTAElements();
 
    @Test(invocationCount = 1)
    public void MSTATest() throws InterruptedException, AWTException
    {
      header.MSTAElementsTest();
    }
}
