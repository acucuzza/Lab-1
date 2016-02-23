package Main;
import java.util.Scanner;

//Names

public class Main {
	public static void main(String[] args) 
	{
		user();	//Call the user method.
	}
	public static void user() 
	{
		//Collect user input to feed into calculations
		
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
		
		user_input.close();
		
		//Feed input into calculations and assign them to variables.
		
		double TS = total_saving(required_income, SSI_income, retired_return, years_to_work, years_retired);
		double SM = save_monthly(TS, annual_return, years_to_work);
		
		//Print and format completed calculation variables.
		
		System.out.printf("You must save a total of, " + "$%.2f%n", TS);
		System.out.printf("Each week you must save, " + "$%.2f%n", SM);
	}
	public static double total_saving(double required_income,double SSI_income,double retired_return,double years_to_work, double years_retired) 
	{
		//Calculate the total amount to save.
		double TS = (required_income-SSI_income)*((1-(1/(Math.pow(1+(retired_return/100)/12, years_retired*12 )))))/((retired_return/100)/12);
		return TS;
	}
	public static double save_monthly(double total_saving,double annual_return,double years_to_work) 
	{
		//Calculate the amounted needed to save per month.
		double save_monthly = total_saving*(((annual_return/100)/12)/((Math.pow(1+(annual_return/100)/12, years_to_work*12))-1));
		return save_monthly;
	}
}