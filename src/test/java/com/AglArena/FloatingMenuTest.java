package com.AglArena;
import org.testng.annotations.Test;

import com.ArenaPages.FloatingMenuElements;
import com.ArenaPages.HeaderElements;

public class FloatingMenuTest extends origin
{
	FloatingMenuElements floating= new FloatingMenuElements();
 
    @Test
    public void floatingTest() throws InterruptedException
    {
      floating.floatingMenuTest();
    }
}
