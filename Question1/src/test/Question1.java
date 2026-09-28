/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author Student
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Declaration 
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        String[] consoles = {"XBOX", "SWITCH", "PS5"};
        int[] total = new int[cities.length];

        // Displaying the report
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n", " ", consoles[0], consoles[1], consoles[2]);
        //Using a loop to display sales 
        for (int i = 0; i < cities.length; i++) 
        {
            System.out.printf("%-20s %-10d %-10d %-10d%n",cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        System.out.println("\n--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");
        //Declaring max to start at 1 so that we can find a sale with more than 1
        int max = 1;
        String HieghCity = "";
        // Calculating the totals for each city
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total[i] = total[i]+sales[i][j];
            }

            System.out.printf("%-20s %-10d%n", cities[i], total[i]);

            // Finding the city with highest
            if (total[i] > max) {
                max = total[i];
                HieghCity = cities[i];
            }
        }
        System.out.println("\nCITY WITH THE MOST SALES: " + HieghCity);
        System.out.println("--------------------------------------------------");
    }
}