package prove;

import java.util.Scanner;

public class EquilaterCone {

	public static void main(String[] args) {
		
			Scanner Radius = new Scanner(System.in);
			System.out.println("Which is your Radius: ");
			double radius = Radius.nextDouble();

			
			double PiGreek = 3.14;
			double SideArea = 2*PiGreek*(radius*radius);
			double BaseArea = PiGreek*(radius*radius);
			double TotalArea = SideArea+BaseArea;
			String SideAreais = "Your side area is: " + SideArea + " cm�";
			String BaseAreais = "Your base area is: " + BaseArea + " cm�";
			String TotalAreais = "Your base area is: " + TotalArea + " cm�";
			double Volume = (PiGreek*(radius*radius*radius)*1.73/3);
			String Volumeis = "Your volume is: " + Volume + " cm�";
			System.out.println(BaseAreais);
			System.out.println(SideAreais);
			System.out.println(TotalAreais);
			System.out.println(Volumeis);
			
			Radius.close();
	}
	
	

}
