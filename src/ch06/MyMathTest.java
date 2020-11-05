package ch06;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5l, 3l);
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multuply(5l, 3l);
		double result4 = mm.devide(5l, 3l); 	//연산결과는 double형이다.
		
		System.out.println("add(5l, 3l) = " + result1);
		System.out.println("subtract(5l, 3l) = " + result2);
		System.out.println("multuply(5l, 3l) = " + result3);
		System.out.println("devide(5l, 3l) = " + result4);
	}
}
class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return a + b;
	}
	long subtract(long a, long b) { return a-b; }
	long multuply(long a, long b) { return a*b; }
	double devide(double a, double b) { return a/b; }
	
}
