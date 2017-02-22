package com.subhash.creational.factory;

public class AnimalFactory {
	
	public static Animal createAnimal(String type){
		if(type.equals("Dog")){
			return new Dog("Pluto");
		}else if(type.equals("Cat")){
			return new Cat("Tom");
		}else{
			return new Animal("Animal");
		}
	}

}
