package com.AglArena;
import org.testng.annotations.Test;
import com.ArenaPages.HeaderElements;

public class HeaderTest extends origin
{
	HeaderElements header= new HeaderElements();
 
    @Test
    public void loginTest() throws InterruptedException
    {
      header.loginTest();
    }
}
