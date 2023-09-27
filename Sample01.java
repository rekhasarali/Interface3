package Interface;


interface demmo1
{
	void test();
	
}
class Demo3 implements demmo1
{
	public void test()
	{
		System.out.println("hai");
	
	}
}

	

public class Sample01 {
	public static void main(String args[]) {
		
	Demo3 d2=new Demo3();
	d2.test();
	
}

}
