import java.util.ArrayList;
import java.util.List;

public class Car {
	
	List<CarPart> parts = new ArrayList<>();
	
	public Car(int fueltank, int numcylinders, int condition)
	{
		FuelTank tank = new FuelTank(fueltank, condition);
		Engine engine = new Engine(numcylinders, condition);
		parts.add(tank);
		parts.add(engine);
	}
	
	public void run() {
		System.out.println("vroom");
		for(int i = 0; i<parts.size();i++)
		{
			parts.get(i).function();
			parts.get(i).status();
			System.out.println("////////////////////////////////////////////");
			
		}
	}
	
	
}
