package foodcalories;

import java.util.Scanner;


public class FoodCalories {

     public static final double RECOMMENDED_CALORIES = 2079; 

                                                         

    public static void main(String[] args) {

        // Variable Declarations

        Scanner keyboard = new Scanner(System.in);

        double servingCalories;

        double caloriePercent;

        String foodType; 

        String brandName;
        
        // Introduction for user

        System.out.println("This program accepts a brand name and descriptive "

        + "food type, followed\n" + "by the amount of Calories in one serving."

        + "It then calculates the percentage\n" + "of the total daily calorie"

        + "requirement of an adult, that the food supplies.");

         

        System.out.println("    Sample Foods and Brands:\n");

        System.out.println("    Brand Name     Descriptive Food Type      Calories Per Serving");

        System.out.println("     --------       -------------------        ------------------ ");

        System.out.println("     Aramark       Cheese Pizza                  163.4            ");

        System.out.println("     Generic       Wild, Raw Altlantic Salmon    562.3            ");

        System.out.println("     Quakers       Oatmeal                       225              ");

        System.out.println("     Starbucks     Cinnamon Raisin Bagel         440              ");

        System.out.println("     Homemade      Mixed Fruit Smoothie          250              ");

        System.out.println("     Tropicana     100% Orange Juice             140              ");

        System.out.println("     Earth         Tap Water                     0                ");
        
        // Prompt for and accept user input

        System.out.print(">Please enter the food type: ");
        
        

        System.out.print("Please enter the amount of Calories in 1 serving:");


    } // end main

} // end CaloriePercentage1226

    

