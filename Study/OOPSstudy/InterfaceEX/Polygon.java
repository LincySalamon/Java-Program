package InterfaceEX;

public interface Polygon extends AreaInterface{
	void getArea();
	public default void getSides() {
		System.out.println("Sides of shapes");
	}
	public default void getPerimeter(int[] sides) 
	//public default void getPerimeter(int... sides)
	{
		int periMeter = 0;
		for(int side:sides) {
			periMeter += side;
		}
		System.out.println("Perimeter of triangle is: "+periMeter);
	}
}
