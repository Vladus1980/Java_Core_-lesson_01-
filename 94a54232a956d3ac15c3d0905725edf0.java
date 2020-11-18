package Vlad;

public class Home_work01 {

	public static void main(String[] args) {
		
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		boolean g;
		char h;			
		
		System.out.println("byte max = " + Byte.MAX_VALUE);
		System.out.println("byte min = " + Byte.MIN_VALUE);
		System.out.println("short max = " + Short.MAX_VALUE);
		System.out.println("short min = " + Short.MIN_VALUE);
		System.out.println("int max = " + Integer.MAX_VALUE);
		System.out.println("int min = " + Integer.MIN_VALUE);
		System.out.println("long max = " + Long.MAX_VALUE);
		System.out.println("long min = " + Long.MIN_VALUE);
		System.out.println("float max = " + Float.MAX_VALUE);
		System.out.println("float min = " + Float.MIN_VALUE);
		System.out.println("double max = " + Double.MAX_VALUE);
		System.out.println("double min = " + Double.MIN_VALUE);
		System.out.println("boolean max = " + Boolean.TRUE);
		System.out.println("boolean min = " + Boolean.FALSE);
		System.out.println("char max = " + Character.MAX_VALUE);
		System.out.println("char min = " + Character.MIN_VALUE);
		
		
		
		int [] array = new int [] {25, 6, 4, 255, 1024, 200, 1, -5, -100, 8 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
		    if (array[i] > max) {
		       max = array[i];
		    } 
		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			 if (array[i] < min) {
			   min = array[i];
			 } 
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}
	
	}
