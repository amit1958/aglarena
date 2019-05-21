package com.AglArena;

public class DeleteStringValue {

	public static void main(String[] args) {
		String value= "?2,93,689.00";
		StringBuilder build = new StringBuilder(value);
		System.out.println("Pre Builder : " + build);
		    build.deleteCharAt(0); // Shift the positions front.
		    build.deleteCharAt(1);
		    build.deleteCharAt(3);
		    build.deleteCharAt(6);
		    build.deleteCharAt(6);
		    build.deleteCharAt(6);
		System.out.println("Post Builder : " + build);

	}

}
