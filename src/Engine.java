
public class Engine extends CarPart{
	
	int numCylinders;
	
	public Engine(int numCylinders, int condition)
	{
		super(condition);
		this.numCylinders = numCylinders;
	}

	@Override
	public void function() {
		System.out.println("\nThis engine has "+numCylinders+" cylinders.");
	}

	@Override
	public void status() {
		System.out.println("\nThis engine is at "+super.condition+".");
		
		
	}
	

}
