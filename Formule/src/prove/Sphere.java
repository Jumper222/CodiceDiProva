package prove;

import java.util.Scanner;

public class Sphere {

public static void main(String[] args) {
// Code for calculate the sphere dimensions

     Scanner SphereArea = new Scanner(System.in);
     System.out.println("Which is the radius of your sphere?");
     double spherearea = SphereArea.nextDouble();

     double radius = spherearea;
     double area = 4*3.14*(radius*radius);
     String areaofsphere = "Your Area is " + area + " cm²";
     System.out.println(areaofsphere);
     // Sphere area calculator


     double volume = (4*3.14*(radius*radius*radius))/3;
     String volumeofsphere = "Your volume is " + volume + " cm³";
     System.out.println(volumeofsphere);
     // Sphere volume area calculator

        SphereArea.close();
        
   }

}
