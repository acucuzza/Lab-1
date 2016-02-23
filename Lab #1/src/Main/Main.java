package Main;
import java.util.Scanner;

//Andrew Cucuzza, Peter Delaney, David Heck, Daniel Szczechura

public class Main {
	public static void main(String[] args) 
	{
		user();	//Call the user method.
	}
	public static void user() 
	{
		//Collect user input to feed into calculations with associated system outs for user convenience
		//Calling scanner class to allow user input
		Scanner user_input = new Scanner(System.in);

		System.out.println("Enter how many years you plan to work: ");
		double years_to_work = user_input.nextDouble();

		System.out.println("Enter the expected average return while working: ");
		double annual_return = user_input.nextDouble();
		
		System.out.println("Enter the amount of years retired: ");
		double years_retired = user_input.nextDouble();
		
		System.out.println("Enter the expected average return while retired: ");
		double retired_return = user_input.nextDouble();

		System.out.println("Enter your required income: ");
		double required_income = user_input.nextDouble();

		System.out.println("Enter the expected SSI income: ");
		double SSI_income = user_input.nextDouble();
		//close user_input from line 15
		user_input.close();
		
		//Feed input into calculations and assign them to variables.
		//TS stands for total saving and SM stands for monthly savings
		double TS = total_saving(required_income, SSI_income, retired_return, years_to_work, years_retired);
		double SM = save_monthly(TS, annual_return, years_to_work);
		
		//Print and format completed calculation variables.
		//This is where the programs outputs the final results
		System.out.printf("You must save a total of, " + "$%.2f%n", TS);
		System.out.printf("Each week you must save, " + "$%.2f%n", SM);
	}
	//This method has five parameters all of type double and returns a type of double, specifically, TS
	public static double total_saving(double required_income,double SSI_income,double retired_return,double years_to_work, double years_retired) 
	{
		//Calculate the total amount to save.
		double TS = (required_income-SSI_income)*((1-(1/(Math.pow(1+(retired_return/100)/12, years_retired*12 )))))/((retired_return/100)/12);
		return TS;
	}
	//This method has three parameters all of type double and retuurns a type of double, specifically, Save_monthly
	public static double save_monthly(double total_saving,double annual_return,double years_to_work) 
	{
		//Calculate the amounted needed to save per month.
		double save_monthly = total_saving*(((annual_return/100)/12)/((Math.pow(1+(annual_return/100)/12, years_to_work*12))-1));
		return save_monthly;
	}
}