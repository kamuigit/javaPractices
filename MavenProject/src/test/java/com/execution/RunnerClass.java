package com.execution;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void executeAll() {
		Result rs = JUnitCore.runClasses(BrowserLaunch.class,ExecutionClass.class);
		int runCount = rs.getRunCount();
		System.out.println("Run count = "+runCount);
		System.out.println("Ignore count : "+rs.getIgnoreCount());
		System.out.println("Failure count : "+rs.getFailureCount());
		System.out.println("run-time : "+rs.getRunTime());
		
		List<Failure> failures = rs.getFailures();
		System.out.println("Failures");
		for (Failure f : failures) {
			System.out.println(f);
		}
	}
}
