package Interface;


interface Bag
{
	void Books();
	static int print(int x)
	{
		return x*x;
	}
	
}
class Shop implements Bag
{
	public void books()
	{
		System.out.println("books get executed");
	}

	@Override
	public void Books() {
		// TODO Auto-generated method stub
		
	}
}

public class Sample04 {

	public static void main(String[] args) {
		Shop b1=new Shop();
		b1.books();
		
		
	}

}
