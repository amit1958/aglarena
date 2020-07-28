package com.AglArena;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ArenaPages.BookingElements;

public class Booking_DealersFormTest extends origin {
	BookingElements booking = new BookingElements();

	@Test
	public void BookingDealers() throws InterruptedException, AWTException {
		booking.bookingElementsTest();
	}
}
