package Main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int years_to_work;
		System.out.println("Enter how many years you plan to work: ");
		years_to_work = user_input.nextInt();
		
		double average_return;
		System.out.println("Enter the expected average return on an investement: ");
		average_return = user_input.nextDouble();
		
		int draw;
		System.out.println("Enter the expected average return on an investement: ");
		draw = user_input.nextInt();
		
		double required_income;
		System.out.println("Enter the investement: ");
		required_income = user_input.nextDouble();
		
		double SSI_income;
		System.out.println("Enter the expected average return on an investement: ");
		SSI_income = user_input.nextDouble();
		
		user_input.close();
		double total_saving = (required_income-SSI_income)*((1-(1/(Math.pow(1+(average_return/100)/12,years_to_work*12 )))))/((average_return/100)/12);
		double save_monthly = total_saving*(((average_return/100)/12)/((Math.pow(1+(average_return/100)/12, years_to_work*12))-1));
	}
}

