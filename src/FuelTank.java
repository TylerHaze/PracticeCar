
public class FuelTank extends CarPart {
	int capacity;
	public FuelTank(int capacity, int condition)
	{
		super(condition);
		this.capacity = capacity;
	}

	@Override
	public void function() {
		System.out.println("\nMy capacity is "+capacity+".");
		
	}

	@Override
	public void status() {
		System.out.println("\nI'm a salvaged fuel tank. I only have "+super.condition+" wear left.");
		
	}
	

}
