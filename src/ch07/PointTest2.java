package ch07;

public class PointTest2 {
	public static void main(String[] args) {
		MyPoint3D p3 = new MyPoint3D(10,2,3);
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
		Point2 p2 = new Point2(10, 20);
		System.out.println(p2.x);
		System.out.println(p2.y);
	}
}

class Point2 {
	int x=10;
	int y=20;
	
	Point2(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
}

class MyPoint3D extends Point2 {
	int z = 30;
	
	MyPoint3D() {
		this(100, 200, 300);
	}
	
	MyPoint3D(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
}