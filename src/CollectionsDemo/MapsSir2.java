package CollectionsDemo;
interface X
{
	
	void display();
	interface Y
	{
		void show1();
		void show2();
	}
}

public class MapsSir2  implements X.Y
{

	@Override
	public void show1() {

System.out.println("Hi");
		
	}

	@Override
	public void show2() {

System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		X.Y xy=new MapsSir2();

xy.show1();
xy.show2();
	}

}
