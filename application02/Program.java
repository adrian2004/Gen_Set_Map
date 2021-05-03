package application02;

import java.util.ArrayList;
import java.util.List;

import entities02.Circle;
import entities02.Rectangle;
import entities02.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(10.0, 5.0));
		myShapes.add(new Circle(20.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(25.0));
		myCircles.add(new Circle(15.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}