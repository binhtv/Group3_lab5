package prob2.extpackage;

import prob2.Circle;
import prob2.Rectangle;
import prob2.Shape;
import prob2.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes = {new Rectangle(10, 20), new Triangle(20, 30), new Circle(15)};
		double sum = 0;
		for(Shape s : shapes) {
			sum += s.computeArea();
		}
		System.out.println("Sum of Areas = " + String.valueOf(sum));
	}

}