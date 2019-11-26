package com.AglArena;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import com.ArenaPages.PressReleaseElements;

public class PressReleaseTest extends origin
{
	PressReleaseElements pr= new PressReleaseElements();
 
    @Test(invocationCount = 1)
    public void MSTATest() throws MalformedURLException, Exception
    {
      pr.PRElementsTest();
    }
}
