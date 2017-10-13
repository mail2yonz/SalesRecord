
/*
Yonatan Mengesha
October 12
Sales Record Project
Java BootCamp


 */

import java.util.Scanner;


//Sales Record Class
public class Sales {

//This is the Main Method
   public static void main(String[] args)
   {
       //Declare the customers id ,customers name ,taxcode ,sales amount ,total amount ,taxamount ,and an ansanswerwere if
      //he wants to continue adding another Record
      int Customer_Id;
      String Customer_Name,TaxCode,answer;
      double SalesAmount,TotalAmount,TaxAmount=0.00;

      //Creating a scanner object with the name keyboard
      Scanner keyboard = new Scanner(System.in);

      //A do while loop that askes the user if they want to add more Records
   do{
      //Asks the user if he/she want to Enter a customers Id and accepts input from the keyboard
      System.out.println("Enter Customer's ID: ");
      Customer_Id=keyboard.nextInt();
      keyboard.nextLine ();

      ////Asks the user if he/she want to Enter a customers Name  and accepts input from the keyboard
      System.out.println("Enter Customer's Name: ");
      keyboard = new Scanner(System.in);
      Customer_Name=keyboard.nextLine ();


      //Asks the user if he/she want to Enter a TaxCode and accepts input from the keyboard
      System.out.println("Enter Customer's TaxCode:(NRM||NPF||BIZ): ");
      keyboard = new Scanner(System.in);
      TaxCode=keyboard.nextLine ();

      //Asks the user if he/she want to Enter Sales Amount  and accepts input from the keyboard
      System.out.println("Enter Customer's SalesAmount: ");
      keyboard = new Scanner(System.in);
      SalesAmount=keyboard.nextDouble();
      keyboard.nextLine ();

      //An if else statement that validates what kind of taxcode the user Entered and assignes a  taxamount
      if(TaxCode.equalsIgnoreCase ( "NRM" ))
      {
         TaxAmount=0.06;
      }else if(TaxCode.equalsIgnoreCase ( "NPF" ))
      {
         TaxAmount=0.00;
      }else if(TaxCode.equalsIgnoreCase ( "BIZ" ))
      {
         TaxAmount=0.045;
      }else{
          System.out.println ("Please Enter a valid TaxCode!" );

      }

      //Calculates the TotalAmount

      TotalAmount=SalesAmount + SalesAmount*TaxAmount;

      //Displays all the inputs
      System.out.println ( );
      System.out.println("The Customer ID is :"+ Customer_Id);
      System.out.println("The Customers Name is :" + Customer_Name);

      System.out.println("The  SalesAmount is :"+ SalesAmount);
      System.out.println("The TaxCode is: :"+ TaxCode);
      //System.out.println("The  TaxAmount is :"+ TaxAmount);
      System.out.println("The Total Amount is :"+ TotalAmount);
      System.out.println();
      System.out.println(" Do you want to Enter another Record (yes/No)");
      answer= keyboard.nextLine ();


   }while(answer.equalsIgnoreCase ( "yes" ));



   }







}
