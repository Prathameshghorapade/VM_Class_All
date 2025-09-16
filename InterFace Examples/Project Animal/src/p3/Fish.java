

package p3;

import p1.Animal;

import p2.Pet;
public class Fish extends Animal implements Pet{

	public String name;

	public Fish(){super(0);}


	@Override
  public String getName(){return name;}

    @Override
  public void setName(String name){ this.name=name;}
	
    @Override
	public void play(){System.out.println(name+" is Swiming Well");}

	 @Override
   public void eat(){System.out.println("Fish eat plants ");}

	@Override
	public void walk(){System.out.println(" Fish Can't Walk  "+"It has "+ legs +"legs");}



}