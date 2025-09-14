package p2;

import java.util.*;
public class Author{

	public String name;
	public String email;
   public char gender;

	public Author(String name,String email,char gender){
		this.name=name; this.email=email; this.gender=gender;}


	    public String getName(){return name;}
	    
		public String getEmail(){return email;}
		public void setEmail(String email){ this.email=email;}

		public char getGender(){return gender;}

        @Override
		public String toString(){

			return "name"+name+"("+gender+")"+"at Email"+email;
		}



}