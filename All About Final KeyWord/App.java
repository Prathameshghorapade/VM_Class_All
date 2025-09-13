

class Data{

final int x=22;

}


public class App{


	public static void main(String[] args) {
		
		Data data = new Data();

		// Here We Got Error that
		//  error: cannot assign a value to final variable x
		// bacause we assign x as Final
		data.x=32;
		System.out.println(x);
	}
}