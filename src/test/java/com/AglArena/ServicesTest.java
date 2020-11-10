package com.AglArena;

import org.testng.annotations.Test;

import com.ArenaPages.ServicesElements;

public class ServicesTest extends origin{
	
	ServicesElements service= new ServicesElements();
	@Test
	public void ServiceTest() throws InterruptedException{
		service.serviceAppointment();
	}

}
