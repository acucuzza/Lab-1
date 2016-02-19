package Main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int years_to_work;
		System.out.println("Enter how many years you plan to work: ");
		years_to_work = user_input.nextInt();
		
		double annual_return;
		System.out.println("Enter the expected average return on an investement: ");
		annual_return = user_input.nextDouble();
		
		int years_retired;
		System.out.println("Enter the amount of years retired : ");
		years_retired = user_input.nextInt();
		
		double required_income;
		System.out.println("Enter your required income: ");
		required_income = user_input.nextDouble();
		
		double SSI_income;
		System.out.println("Enter the expected SSI income: ");
		SSI_income = user_input.nextDouble();
		
		user_input.close();
		double total_saving = (required_income-SSI_income)*((1-(1/(Math.pow(1+(annual_return/100)/12,years_to_work*12 )))))/((annual_return/100)/12);
		double save_monthly = total_saving*(((annual_return/100)/12)/((Math.pow(1+(annual_return/100)/12, years_to_work*12))-1));
		System.out.printf("%.2f",total_saving, "\n");
		System.out.printf("%.2f",save_monthly, "\n");
	}
}

