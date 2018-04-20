package prove;

import java.util.Scanner;
       

public class Cubo {

	public static void main(String[] args) {
		
			
		
		Scanner Input = new Scanner(System.in);
		System.out.println("What is the side of your cube");
		double line = Input.nextDouble();
		
		double side = line;
		double diagonal;
		double SquareRoot3 = Math.sqrt(3);
		diagonal = side*SquareRoot3;
		String Diagonalis = "Diagonal is " + diagonal + " cm";
		System.out.println(Diagonalis);
		//Diagonal formula calculator
		
		double Face = side*side;
		String Faceis = "Face is " + Face+ " cm²";
		System.out.println(Faceis);
		//Face formula calculator
		
		double SideArea = 4*(side*side);
		String SideAreais = "Side area is " + SideArea + " cm²";
		System.out.println(SideAreais);
		//Side area calculator
		
		double BaseArea = side*side;
		String BaseAreais = "Base area is " + BaseArea + " cm²";
		System.out.println(BaseAreais);
		//Base area calculator
		
		double TotalArea = BaseArea*2+SideArea;
		String TotalAreais = "Total area is " + TotalArea + " cm²";
		System.out.println(TotalAreais);
		//Total area calculator
		
		double Volume = side*side*side;
		String Volumeis = "Volume is " + Volume + " cm³";
		System.out.println(Volumeis);
		//Volume formula calculator.
		
		Input.close();
		
		
		
		
	}

}
