abstract class Shape{
	abstract void numberOfSides();
}
class rectangle extends Shape{
	void numberOfSides(){
		System.out.println("The Number of Sides of a Rectangle is 4");
	}
}
class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("The Number of Sides of a Triangle is 3");
	}
}
class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("The Number of Sides of a Hexagon is 5");
	}
}
class SHAPE{
	public static void main(String args[]){
		Triangle sc=new Triangle();
		Hexagon sc1=new Hexagon();
		rectangle sc2=new rectangle();
		sc.numberOfSides();
		sc1.numberOfSides();
		sc2.numberOfSides();
	}
}
		
