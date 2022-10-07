package com.execution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed123 implements IRetryAnalyzer {
	int min = 0, max = 3;

	public boolean retry(ITestResult result) {
		if (min < max) {
			min++;
			return true;

		}
		return false;
	}

}
