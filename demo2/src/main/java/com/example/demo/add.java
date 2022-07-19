package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class add {
	
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public int addition(int b,int c) {
		a = b+c;
		return a;
	}
	public void show() {
		
		System.out.println("addition is");
	}

}
