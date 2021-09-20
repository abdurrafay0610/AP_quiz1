package quiz1;
//ello
abstract class Animal 
{
	int legs;
	Animal()
	{
		
	}
	Animal(int l)
	{
		legs=l;
	}
	abstract void eat();
	public void walk()
	{
		System.out.println("The animal walks on "+ legs +" legs");
	}
}
