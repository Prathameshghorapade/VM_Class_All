

package p4;

import p1.Animal;

import p2.Pet;


public class Cat extends Animal implements Pet{

	public String name;

public Cat(){this("");}

public Cat(String name){ super(4); this.name=name;}

@Override
public String getName(){return name;}

@Override
public void setName(String name){ this.name=name;}



	
    @Override
	public void play(){System.out.println(name+" is Playing");}

	 @Override
   public void eat(){System.out.println(name+" Eat Fish and Milk ");}


}