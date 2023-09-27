package Interface;

interface Lion
{
	void roar();
}
interface Dog
{
	void bark();
}


public class Sample03 implements Lion,Dog
{
	public void roar()
	{
		System.out.println("Lion is executed");
	}
	public void bark()
	{
		System.out.println("Dog is executed");
	}

	public static void main(String[] args) {
		
		 Sample03 e=new  Sample03();
		 e.roar();
		 e.bark();
		// TODO Auto-generated method stub

	}

}
