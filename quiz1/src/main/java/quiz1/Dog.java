package quiz1;

public class Dog extends Animal 
{
	Pet name;
	
	Dog()
	{
		
	}
	Dog(String n)
	{
		name.setName(n);
		super.legs=4;
	}
	
	public void eat()
	{
		System.out.println("The Dog eats with its mouth");
	}
}
