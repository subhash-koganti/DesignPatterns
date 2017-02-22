package com.subhash.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {

		Animal a1 = AnimalFactory.createAnimal("Dog");

		System.out.println(a1.getName());

		Animal a2 = AnimalFactory.createAnimal("Cat");

		System.out.println(a2.getName());

	}

}
