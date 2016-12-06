package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {
	
	public static void main(String[] args) {
		Dog dog = new Dog("해피", "도베르만", "검정색");
	
		dog.setName("바둑이");
		dog.setColor("검정에 흰점");
		
		
		System.out.println(dog.getName());
		System.out.println(dog.getKind());
		System.out.println(dog.getColor());
		
		
	}
	
	
}

