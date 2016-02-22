package Main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		user();
		
		
	}
	public static void user() {
		Scanner user_input = new Scanner(System.in);

		System.out.println("Enter how many years you plan to work: ");
		int years_to_work = user_input.nextInt();

		System.out.println("Enter the expected average return on an investement: ");
		double annual_return = user_input.nextDouble();
		
		System.out.println("Enter the amount of years retired : ");
		int years_retired = user_input.nextInt();

		System.out.println("Enter your required income: ");
		double required_income = user_input.nextDouble();

		System.out.println("Enter the expected SSI income: ");
		double SSI_income = user_input.nextDouble();
		
		user_input.close();
		double total_saving = total_saving(required_income, SSI_income, annual_return, years_to_work);
		double save_monthly = save_monthly(total_saving, annual_return, years_to_work);
		System.out.printf("%.2f%n",total_saving);
		System.out.printf("%.2f%n",save_monthly);
	}
	public static double total_saving(double required_income,double SSI_income,double annual_return,int years_to_work) {
		double total_saving = (required_income-SSI_income)*((1-(1/(Math.pow(1+(annual_return/100)/12, years_to_work*12 )))))/((annual_return/100)/12);
		return total_saving;
	}
	public static double save_monthly(double total_saving,double annual_return,int years_to_work) {
		double save_monthly = total_saving*(((annual_return/100)/12)/((Math.pow(1+(annual_return/100)/12, years_to_work*12))-1));
		return save_monthly;
	}
}

