package Advance;

import org.testng.annotations.Test;

import SeleniumUtility.SeleniumUtility;


public class Parallel extends SeleniumUtility {
	@Test
	public void testCaseOne() {
		setUp("chrome", "https://www.google.com");
		cleanUp();
	}

	@Test
	public void testCaseTwo() {
		setUp("ie", "https://www.google.com");
		cleanUp();
	}
}