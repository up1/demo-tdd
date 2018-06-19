package com.example.demo;

public class DemoRange {
	private static final String STRING = "[";
	private String input;

	public DemoRange() {
	}

	public String of(String input) {
		return "1,2,3,4,5";
	}

	public DemoRange(String input) {
		this.input = input;
	}

	public boolean isStartWithInclude() {
		return this.input.startsWith(STRING);
	}

	public boolean isEndWithInclude() {
		return this.input.endsWith("]");
	}

	public int getStart() {
		if(isStartWithInclude()) {
			return this.input.charAt(1) - 48;
		}
		return this.input.charAt(1) - 47;
	}

}
