package prove;

import java.util.Scanner;

public class Cono {
	
	public static void main(String[] args) {
		
		Scanner Radius = new Scanner(System.in);
		System.out.println("What is the radius of your cone ");
		double radius = Radius.nextDouble();
		
		Scanner Apothem = new Scanner(System.in);
		System.out.println("What is the apothem of your cone ");
		double apothem = Apothem.nextDouble();
		
		Scanner Height = new Scanner(System.in);
		System.out.println("What is the height of your cone");
		double height = Height.nextDouble();
		
		double PiGreek = 3.14;
		double BaseArea = PiGreek*(radius*radius);
		String BaseAreais = "The base area of your cone is: " + BaseArea;
		System.out.println(BaseAreais);
		//Base Area Calculator

		double SideArea = (PiGreek*radius)*apothem;
		String SideAreais = "The side area of your cone is: " + SideArea;
		System.out.println(SideAreais);
		//Side Area Calculator
		
		double TotalArea = SideArea+BaseArea;
		String TotalAreais = "The total area of your cone is: " + TotalArea;
		System.out.println(TotalAreais);
		//Total Area Calculator
		
		double Volume = (PiGreek*(radius*radius)*height)/3;
		String Volumeis = "The volume of your cone is: " + Volume;
		System.out.println(Volumeis);
		//Volume Calculator
		
		Radius.close();
		Apothem.close();
		Height.close();
    }
}

