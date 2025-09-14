

//import java.util.*;

package p1;

public class Customer{

	public int id;  public String name;  public char gender;

	public Customer(int id,String name,char gender ){this.id=id; this.name=name; this.gender=gender;}

	public int getId(){return id;}  public String getName(){return name;}   public char getGender(){return gender;}

	@Override
	public String toString(){return "Name :"+name+","+"Id :"+id+"," +"Gender :"+gender+",";
	}








}