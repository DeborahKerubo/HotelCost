import java.util.Scanner;

//This program demonstrates the total cost for nights stayed in an Hotel

public class HotelCost
{
  public static void main(String[] args)
  {
  int nightsNumber;
  double roomCost =179.00;        // Amount to be paid per night.
  double roomCharge;              // Amount to be paid for the number of nights stayed.   
  double salesTax ;               //Sales tax paid
  double countyTax ;              // County sales tax
  double occupancyTax ;          //Occupancy tax
  double totalCost ;             // Total cost for hotel stay
  Scanner keyboard = new Scanner(System.in);
  
  //Enter the number of nights stayed at the hotel.
  System.out.print("How many nights did you stay at Hotel Storm? ");
  nightsNumber = keyboard.nextInt();
  
  //Calculate the amount to be paid.
  roomCharge = nightsNumber*roomCost;
  
  //Calculate the sales Tax.
  salesTax = roomCharge*0.0475;
  
  //Calculate the county Tax.
  countyTax = roomCharge* 0.0225;
  
  //Calculate the occupancy Tax.
  occupancyTax = roomCharge*0.06;
  
  //Calculate the total cost.
  totalCost =(roomCharge + salesTax + countyTax + occupancyTax);
 
  // Display the following information.
  
  System.out.println("We are delighted to have you at Hotel Storm!");
  System.out.println("Room Charge:"+" "+ "$" + roomCost);
  System.out.println("States Sales Tax:"+" "+"$"+ salesTax);
  System.out.println("County Sales Tax:"+" "+"$"+ countyTax);
  System.out.println("Occupancy Tax:" +" "+"$"+ occupancyTax);
  System.out.println("Total Cost:" +" "+"$"+ totalCost);
  }
}
  