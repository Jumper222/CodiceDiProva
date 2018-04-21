package Parallelepiped;
import java.util.Scanner;
public class Parallelepiped {

	public static void main(String[] args) {
		// Code for calculate the Parallelepiped dimensions
		
		Scanner base = new Scanner(System.in);
		System.out.println("Which is the base of your rectangle?");
		double e = base.nextDouble();
		
		Scanner height = new Scanner(System.in);
		System.out.println("Which is the height of your rectangle?");
		double side = height.nextDouble();
		
	   Scanner c = new Scanner(System.in);
	   System.out.println("Which is the height of your parallelpiped");
	   double r = c.nextDouble();
	  
	   double bsra = e * side;
	   String basearea = "Your base area is " + bsra + " cm²";
	   System.out.println(basearea);
	   //Base area formula calculator
	   
	   double perimeter = (e+side)*2;
	   double siara = perimeter * r;
	   String sidearea = "Your side area is " + siara + " cm²";
	   System.out.println(sidearea);
	   //Side area formula calculator
	   
	   double basera = bsra;
	   double sidera = siara;
	   double totarea = bsra + siara;
	   String totalArea = "Your total area is " + totarea + " cm²" ;
	   System.out.println(totalArea);
	   //total area formula calculator
	   
	   
	   
	   double baseara = bsra;
	   double sideara = r;
	   double vlm = bsra * r;
	   String volume = "Your volume is " + vlm + " cm³";
	   System.out.println(volume);
	   //volume formula calculator
	   
	   
	   base.close();
	   height.close();
	   c.close();
	   
	    
		
	}

}
