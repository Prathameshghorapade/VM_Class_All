package p6;

import p1.Animal;

import p2.Pet;

import p3.Fish;

import p4.Cat;

import p5.Spider;

class App{


	public static void main(String[] args) {

		Fish fish = new Fish();
		fish.setName("GOld");
		System.out.println(fish.getName());
		fish.play();
		fish.eat();
		fish.walk();
 
  System.out.println("=====================================================");

    Cat cat = new Cat("Fluppy");

    cat.play();
    cat.eat();
    cat.walk();

     System.out.println("=====================================================");


     Animal animal1=new Fish();
    // Here we can use only 2 methods 
     //beacause we can give the refrence of Animal and creating an object of Fish 
     // Animal can have only two fields eat and walk hence we can olny use these two  
     // It is called runTime Polymorphism
		animal1.eat();
		animal1.walk();

		 System.out.println("=====================================================");

  



		
	}
}