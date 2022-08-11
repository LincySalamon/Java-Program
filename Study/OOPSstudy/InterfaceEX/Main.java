package InterfaceEX;

class Rectangle implements Polygon{
	@Override
	public void getArea() {
		double d = 10.50; 
		double e = 20.00;
		double area = d*e;
		System.out.println("The area of the Triangle is: "+area);
	}
}
class Square implements Polygon{
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		double a = 15.5;
		double area = a*a;
		System.out.println("The area of the square is: "+area);
	}
	public void getSides() {
		System.out.println("Square have 4 sides");
	}
}
class Triangle implements Polygon{
	private int l,b,h;
	private double s,area;
	Triangle(int l,int b,int h){
		this.l = l;
		this.b = b;
		this.h = h;
		s = 0;
	}
	@Override
	public void getArea() {
		//heron formula for find area of triangle 
		// s = (l+b+h)/2 then area = root of (s(s-l)(s-b)(s-c))
		s = (double)(l+b+h)/2;
		area = Math.sqrt(s*(s-l)*(s-b)*(s-h));
		System.out.println("Area of Triangle using Heron Formula: "+area);
	}
}
public class Main {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.getArea();
		rect.getSides();
		Square sq = new Square();
		sq.getArea();
		sq.getSides();
		int arrVal[] = new int[] {5,7,9};
		Triangle tri = new Triangle(5,7,9);
		tri.getArea();
		tri.getPerimeter(arrVal);//or we give like this tri.getPerimeter(5,7,9);
	}
}
