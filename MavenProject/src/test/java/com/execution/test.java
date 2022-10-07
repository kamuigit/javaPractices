package com.execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	@Test
	private void tc1() {
		System.out.println("Test 1");
	}

	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("test 2");
	}

	@Test(retryAnalyzer = Failed123.class)
	private void tc3() {
		Assert.assertTrue(false);
		System.out.println("test 3");
	}

	@Test
	private void tc4() {

		System.out.println("test 4");
	}

}
