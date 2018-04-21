package prove;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		// Code for calculate the Cylinder dimensions
		
        Scanner base = new Scanner(System.in);
        System.out.println("Which is the radius of your circle?");
        double bas = base.nextDouble();
        
        Scanner height = new Scanner(System.in);
        System.out.println("Which is the height of your cylinder?");
        double heigh = height.nextDouble();
        
        double basare = (bas * bas)* 3.14;
        String basearea = "Your base area " + basare + " cm²";
        System.out.println(basearea);
        // Cylinder Base area calculator
        
        double sidare = 2 * 3.14 * bas * heigh;
        String sidearea = "Your side area is " + sidare + "  cm²";
        System.out.println(sidearea);
        // Cylinder Side Area calculator
        
        double totarea = 2 * 3.14 * bas * (heigh + bas) ;
        String totalArea = "Your total area is " + totarea + " cm²";
        System.out.println(totalArea);
        // Cylinder Total Area calculator
        
        double vlm = basare * heigh;
        String volume = "Your volume is " + vlm + " cm³";
        System.out.println(volume);
        // Cylinder volume calculator
        
        
        base.close();
        height.close();
        		
        
	}

}
