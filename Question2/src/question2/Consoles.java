package question2;
//Emplement class
public abstract class Consoles implements IConsoles 
{
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor
    public Consoles(String Type, String store, int total) 
    {
        this.consoleType =Type;
        this.storeName = store;
        this.totalSales = total;
    }

    // Getter methods and the overides
    @Override
    public String getConsoleType() 
    {
        return consoleType;
    }

    @Override
    public String getStore() 
    {
        return storeName;
    }

    @Override
    public int getTotalSales() 
    {
        return totalSales;
    }
}