package prove;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {

		Scanner ScanSide = new Scanner(System.in);
		System.out.println("What is the side of your piramid?");
		double ScannedSide = ScanSide.nextDouble();
		
		Scanner ScanHeight = new Scanner (System.in);
		System.out.println("What is the height of your piramid?");
		double ScannedHeight = ScanHeight.nextDouble();
		
		double side = ScannedSide;
		double perimeter = side*4;
		double Height = ScannedHeight;
		double BaseArea = side*side;
		double Volume = BaseArea*Height/2;
		String Volumeis = ("The volume of your piramid is: " + Volume);
		System.out.println(Volumeis);
		//Volume formula calculator
		
		double apothem = Math.sqrt(Height+side/2);
		double SideArea = perimeter*apothem/2;
		String SideAreais = ("The Side area of your piramid is: " + SideArea);
		System.out.println(SideAreais);
		String BaseAreais = ("The base area of your piramid is: " + SideArea);
		System.out.println(BaseAreais);
		String AFaceis = ("A face of your piramid is: " + side*apothem/2);
		System.out.println(AFaceis);
		
		ScanSide.close();
		ScanHeight.close();
		
		
		
	}

}
