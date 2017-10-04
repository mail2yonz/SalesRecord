import java.util.Scanner;

public class Sales {


   public static void main(String[] args)
   {

      int Customer_Id;
      String Customer_Name,TaxCode;
      double SalesAmount,TotalAmount,TaxAmount=0.00;

      Scanner keyboard = new Scanner(System.in);


      System.out.println("Enter Customer's ID: ");
      Customer_Id=keyboard.nextInt();

      System.out.println("Enter Customer's Name: ");
       keyboard = new Scanner(System.in);

      Customer_Name=keyboard.nextLine ();


      System.out.println("Enter Customer's TaxCode: ");
      keyboard = new Scanner(System.in);
      TaxCode=keyboard.nextLine ();


      System.out.println("Enter Customer's SalesAmount: ");
      keyboard = new Scanner(System.in);
      SalesAmount=keyboard.nextDouble();

      if(TaxCode.equalsIgnoreCase ( "NRM" ))
      {
         TaxAmount=0.06;
      }else if(TaxCode.equalsIgnoreCase ( "NPF" ))
      {
         TaxAmount=0.00;
      }else if(TaxCode.equalsIgnoreCase ( "BIZ" ))
      {
         TaxAmount=0.045;
      }

       TotalAmount=SalesAmount + SalesAmount*TaxAmount;

      System.out.println("The Customer ID is :"+ Customer_Id);
      System.out.println("The Customers Name is :" + Customer_Name);
      System.out.println("The TaxCode is: :"+ TaxCode);
      System.out.println("The  SalesAmount is :"+ SalesAmount);
      System.out.println("The  TaxAmount is :"+ TaxAmount);
      System.out.println("The total Amount is :"+ TotalAmount);



   }







}
