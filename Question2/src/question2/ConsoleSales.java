package question2;

public class ConsoleSales extends Consoles 
{

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) 
    {
        super(consoleType, store, totalSales);
    }
    // Method to print all the sales report
    public void printReport() 
    {
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
        System.out.println("--------------------------------------------------");
    }
}