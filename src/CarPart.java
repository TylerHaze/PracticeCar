
abstract class CarPart implements Functional {
	
	public int condition;
	
	public CarPart(int condition)
	{
		this.condition = condition;
	}
	
	public void lowerCondition()
	{
		condition = condition-5;
	}
	abstract void status();

}
