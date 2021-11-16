import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		double[] monthSales = { 250.56, 389.90, 900.01, 190.00, 231.22, 555.55, 1234.56, 1011.12, 50099.30 };

		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthName.length) {
				Console.displayLine("Invalid month number. Try again.");
				continue;
			}

			// get the index number for the month
			// and display the month name and sales
			int monthIndex = monthNumber;
			Console.displayLine("Sales for " + monthName[monthNumber - 1] + ": " + monthSales[monthNumber - 1]);

			// check if the user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			Console.displayLine();
		}

		// display the total sales for the year
//		double sum = 0.0;
//		{
//			for (int i = 0; i < monthSales.length; i++) {
//				sum = sum + monthSales[i];

			

		Console.displayLine();
	}	
	

}
