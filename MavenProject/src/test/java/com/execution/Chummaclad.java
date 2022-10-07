package com.execution;

import org.testng.annotations.Test;

public class Chummaclad {

	@Test
	private void tc111() {
		System.out.println("test 111 : "+Thread.currentThread().getId());
	}
	
	@Test
	private void tc333() {
		System.out.println("test 333 : "+Thread.currentThread().getId());
	}
	
	@Test
	private void tc222() {
		System.out.println("test 222 : "+Thread.currentThread().getId());
	}
}
