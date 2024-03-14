import java.util.Scanner;

public class Offer

{

public static void main (String[] args)

{

Scanner Objname = new Scanner(System.in);

System.out.println("Name");

String Name = Objname.nextLine();

Scanner Company = new Scanner(System.in);
System.out.println("Company");
String CompanyName = Company.nextLine();

Scanner Jobmode = new Scanner(System.in);
System.out.println("WorkMode");
String Mode = Jobmode.nextLine();

Scanner Position = new Scanner(System.in);
System.out.println("Position");
String Workposition = Position.nextLine();

Scanner Joinning = new Scanner(System.in);
System.out.println("Joinning Date");
String JoinDate = Joinning.nextLine();

System.out.println(" ");
System.out.println("Dear " + Name);


System.out.println(" ");
System.out.println(" " + CompanyName + " happy to let you know that we are impressed with your credentials \n and welcome you to the family. We are certain that you would play a vital \n role in our growth and success, and you will be a valuable addition to our \n talented team.");

System.out.println(" ");


System.out.println(" We are delighted to offer you the " + Mode + " position of " + Workposition + " with an anticipated \n start date of " + JoinDate +" , at our Urapakkam office. You have to report at our \n Urapakkam office and continue to work from there. Your initial training \n with the Talent Nurturing team and the department specific training will be \n for a maximum duration of six months. The salary during training will be \n Rs.12,000 per month which will be prorated based on your training duration. At \n the end of training period, a formal evaluation of your performance will be made.");

}

}