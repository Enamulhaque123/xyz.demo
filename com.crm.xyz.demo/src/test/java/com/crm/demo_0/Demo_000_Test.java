package com.crm.demo_0;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo_000_Test {
	@Test
	public void m1() {
		System.out.println("m1 run");
	}
	@Test
	public void m2() {
		System.out.println("m2 run");
	}
	@Test
	public void m3() {
		System.out.println("m3 run");
	}
	@Test
	public void m4() {
		System.out.println("m4 run");
	}
	@Test
	public void Parameter1() {
		
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("userename"));
		System.out.println(System.getProperty("password"));

	}
}
