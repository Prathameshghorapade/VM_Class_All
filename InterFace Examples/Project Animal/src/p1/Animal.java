
package p1;


public abstract class Animal {

	protected int legs;

	protected Animal(int legs){ this.legs=legs;}

	public void walk(){System.out.println(" Walking with  "+legs +" legs");}

	public abstract void eat();








}