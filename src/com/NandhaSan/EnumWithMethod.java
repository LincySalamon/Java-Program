package com.NandhaSan;

enum Fruit{
	APPLE,ORANGE,GRAPES,KIVI,FIG,POMO;

	public String getColor() {
		switch(this){
			case APPLE :
				return "RED";
			case ORANGE :
				return "ORANGE";
			case GRAPES :
				return "PURPLE";
			case KIVI :
				return "GREEN";
			case FIG :
				return "GREEN";
			case POMO :
				return "PETROOT RED";
			default:
				return null;
		}
	}
}

public class EnumWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = Fruit.APPLE.getColor();
		System.out.println("Color of "+Fruit.APPLE+" is "+color);
		Fruit apple = Fruit.APPLE;
		System.out.println("Ordinal of Apple is "+apple.ordinal());
		System.out.println(Fruit.GRAPES.compareTo(apple));
		System.out.println(apple.toString());
		System.out.println(apple.name());
		System.out.println(Fruit.FIG.name());
		System.out.println(Fruit.valueOf("KIVI"));
		Fruit[] fruitArr = Fruit.values();
		for(int i=0;i<fruitArr.length;i++) {
			System.out.print(fruitArr[i]+"  ");
		}
	}

}
