package Basicjava;

public class MathClass {

	public static void main(String[] args) {
		
		double pi=Math.PI;
		int r =10;
		double area=pi*r*r;
		System.out.println(area);
		System.out.println(Math.addExact(23, 45));
		System.out.println(Math.addExact(1212121212, 100000));
		System.out.println(Math.subtractExact(43, 32));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.abs(-23));//gives positive of the number
		System.out.println(Math.random());
		System.out.println(Math.max(2312121, 12121111));
		System.out.println(Math.min(32121212, 232111));
	}

}
