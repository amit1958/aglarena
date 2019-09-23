package com.AglArena;
import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ArenaPages.MDSElements;
import com.ArenaPages.MSTAElements;

public class MDSFormTest extends origin
{
	MDSElements header= new MDSElements();
 
    @Test(invocationCount = 1)
    public void MDSTest() throws InterruptedException, AWTException
    {
      header.MDSElementsTest();
    }
}
