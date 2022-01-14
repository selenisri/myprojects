package scripts;

public class Learnoverloading {
	
	
	//Function with similar names can do two different operations.
	//It can Differentiated by the no of parameter passed or datatype
	//Run Time polymorphism
	
	public void text(String Alphac)
	{
		System.out.println("Iam "+ Alphac);
	}
	
	public void text(int a , int b)
	{
		System.out.println("Iam "+ a);
		System.out.println("Iam "+ b);
	}
	
	public static void main(String args[])
	{
		Learnoverloading learn = new Learnoverloading();
		
		learn.text("Raja");
		learn.text(1, 2);
	}
	

}
