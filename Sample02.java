package Interface;

interface Shape
{
	void Draw();
}
class Rectangle implements Shape{
	public void Draw()
	{
		System.out.println("Draw the shape of Rectangle");
	}
}
class Circle implements Shape 
{
	public void Draw()
	{
		System.out.println("Draw the shape of Circle");
	}
}

public class Sample02 {
	
		public static void main(String[] args) {
			Shape s=new Circle();
			s.Draw();
			Shape r=new Rectangle();
			r.Draw();
	

	}

}
