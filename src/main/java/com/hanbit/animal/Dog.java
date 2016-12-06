package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Dog {

	private static final String DEFAULT_NAME = "멍멍이";
	
	private String name;
	private final String kind;
	private String color;
	
	
	public Dog(String kind, String color){
		this.name = DEFAULT_NAME;
		this.kind = kind;
		this.color = color;
	}
	
	
	public Dog(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
		
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(StringUtils.isBlank(name)) {
			name = "멍멍이";
		}
		
		this.name = name;
	}
	
	public void setColor(String color) {
		if(StringUtils.isBlank(color)) {
			return;
		}
		
		this.color = color;
	}
	
	

	public String getKind() {
		return kind;
	}

	public String getColor() {
		return color;
	}

	
	
}
