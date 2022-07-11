package Interface1;
class Shapes{
	void draw() {
		System.out.println("Drawing a shape");
	}
	void erase () {
		System.out.println("Erasing Shape");
		}
	}
class Circle extends Shapes{
	void draw() {
		System.out.println("Drawing a Circle");
	}
	void erase () {
		System.out.println("Erasing Circle");
		}
}
class Triangle extends Shapes{
	void draw() {
		System.out.println("Drawing a Triangle");
	}
	void erase () {
		System.out.println("Erasing Triangle");
		}
}
class Square extends Shapes{
	void draw() {
		System.out.println("Drawing a Square ");
	}
	void erase () {
		System.out.println("Erasing Square ");
		}
}
public class Ex2 {

	public static void main(String[] args) {
		Shapes sh=new Shapes();
		sh.draw();
		sh.erase();
		
		Circle cl= new Circle();
		cl.draw();cl.erase();
		
		Triangle t =new Triangle();
		t.draw();t.erase(); 
		
      Square s =new Square();
      s.draw();
      s.erase();
	}

}
