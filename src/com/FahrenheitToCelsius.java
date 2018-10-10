package com;
import java.util.Scanner;

public class FahrenheitToCelsius {


   public static double convertCelFahr(double tempF) {
	   double tempC = 0.0;
	   return tempF = tempC * (9 / 5) + 32;
     
}
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double tempF;
      double tempC;

      System.out.println("Enter temperature in Celsius: ");
      tempC = scnr.nextDouble();

      tempF = convertCelFahr(tempC);

      System.out.print("Fahrenheit: ");
      System.out.println(tempF);
      
      scnr.close();
   }
}
