package prove;

import java.util.Scanner;

public class EquilateralCylinder {

	public static void main(String[] args) {
		// Code for calculate the Equilater Cylinder dimensions
		
		Scanner a = new Scanner(System.in);
		System.out.println("Which is the radius of your circle?");
		double radius = a.nextDouble();
		
		double basearea = 3.14 * (radius*radius);
		String baseara = "Your base area is " + basearea + " cm˛";
		System.out.println(baseara);
		// Base area formula calculator
		
		
		double sidearea = 4 * 3.14 * (radius*radius);
		String sideara = "Your side area is " + sidearea + " cm˛";
		System.out.println(sideara);
		// Side area formula calculator
		
		
		double totalarea = 6 * 3.14 * (radius * radius);
		String totArea = "Your total area is " + totalarea + " cm˛";
		System.out.println(totArea);
		// Total area formula calculator
		
		
		double volume = 2 * 3.14 * (radius * radius * radius);
		String vlm = "Your volume is " + volume + " cmł";
		System.out.println(vlm);
		// Volume formula calculator
		
		a.close();		

	}

}
