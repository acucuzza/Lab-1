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
		System.out.println("Enter the expected average return on an investement: ");
		required_income = user_input.nextDouble();
		
		double SSI_income;
		System.out.println("Enter the expected average return on an investement: ");
		SSI_income = user_input.nextDouble();
		
		user_input.close();
		
		// future value formula & payment formula
	}
}

