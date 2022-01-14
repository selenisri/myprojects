package scripts;

public class Learoverriddingchild extends overriddingparent {
	
	
	//Here u can decide what should happen here , we can override the ruletwo
	
	@Override
	public void ruletwo()
	{
		System.out.println("iam different");
	}
	
	
	public static void main(String args[])
	{
		overriddingparent callme = new Learoverriddingchild();
		
		callme.ruleone();
		callme.ruletwo();
		
		
		
		
	}
	
	

}
