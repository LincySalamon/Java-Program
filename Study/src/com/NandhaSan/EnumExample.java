package com.NandhaSan;

enum Size{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
class Order{
	Size pizzaSize;
	public Order(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL :
			System.out.println("Order a small pizza");
			break;
		case MEDIUM :
			System.out.println("Order a medum pizza");
			break;
		case LARGE :
			System.out.println("Order a large pizza");
			break;
		case EXTRALARGE :
			System.out.println("Order a extra large pizza");
			break;
		}
	}
}
public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(Size.MEDIUM);
		order.orderPizza();
		
	}
}
