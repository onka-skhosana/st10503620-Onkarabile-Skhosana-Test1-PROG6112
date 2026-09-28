package question2;

import java.util.Scanner;

public class Question2   {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user for console device type
        System.out.print("Enter the console device type: ");
        String consoleType = scanner.nextLine();

        // Prompt user for store name
        System.out.print("Enter the store name: ");
        String store = scanner.nextLine();

        // Asking the user for total amount of sales
        System.out.print("Enter the total amount of sales: ");
        int totalSales = scanner.nextInt();

        System.out.println(); // Blank line for formatting

        // Instantiate the ConsoleSales class
        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);

        // Displaying the report
        salesReport.printReport();
        //Closing the scanner 
        scanner.close();
    }
}