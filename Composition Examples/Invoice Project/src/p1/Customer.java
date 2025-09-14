
package p1;

public class Customer{

public int id;

public String name;

public int discount;

public Customer(int id,String name,int discount){this.id=id; this.name=name; this.discount=discount;}

public int getId(){return id;}

public String getName(){return name;}

public int getDiscount(){return discount;}

public void setDiscount(int discount){this.discount=discount;}

@Override
public String toString(){

	return "Name :"+name+","+"Id :"+id+",";
}



}