package lab8.day2.prob2;

import java.util.function.Supplier;

public class ProblemII {
	public static void main(String...strings) {
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());
	}
}
