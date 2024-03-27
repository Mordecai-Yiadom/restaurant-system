import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*********************************************************
                            DECLARING VARIABLES
         *********************************************************/

        final int NUM_OF_ITERATIONS = 3; //Number of Employees and Customer to be output

        final int CURRENT_YEAR = 2024;
        final int WEEKS_IN_YEAR = 52;

        final float INCOME_TAX = 0.05f; //5.0% Income Tax
        final float SALES_TAX = 0.0625f; //6.25% Sales Tax

        final int STAFF_TO_PREDICT = 20;

        //Employee Variables
        String empFirstName[] = new String[NUM_OF_ITERATIONS];
        String empLastName[] = new String[NUM_OF_ITERATIONS];
        String empPhoneNum[] = new String[NUM_OF_ITERATIONS];
        int empYearOfHiring[] = new int[NUM_OF_ITERATIONS];
        String empPosition[] = new String[NUM_OF_ITERATIONS];
        int empWageRate[] = new int[NUM_OF_ITERATIONS];
        int empWeeklyHours[] = new int[NUM_OF_ITERATIONS];

        //Employee Financial Variables
        float empWeeklyPay[] = new float[NUM_OF_ITERATIONS];
        float empAnnualSalary[] = new float[NUM_OF_ITERATIONS];
        float empAnnualTax[] = new float[NUM_OF_ITERATIONS];
        float empNetIncome[] = new float[NUM_OF_ITERATIONS];

        //Sum of all employees' salaries
        float totalAnnualSalary, averageSalary;

        //Predicted salary budget (for given amount of employees)
        float predictedSalaryBudget;

        //Employee Years of Experience
        int empExperience[] = new int[NUM_OF_ITERATIONS];


        //Customer Variables
        String cusFirstName[] = new String[NUM_OF_ITERATIONS];
        String cusLastName[] = new String[NUM_OF_ITERATIONS];
        String cusPhoneNum[] = new String[NUM_OF_ITERATIONS];
        String cusTimeOfOrder[] = new String[NUM_OF_ITERATIONS];
        String cusOrderType[] = new String[NUM_OF_ITERATIONS];
        String cusOnlineOrder[] = new String[NUM_OF_ITERATIONS];

        //Customer Order Total Variables
        float cusTotalBeforeTax[] = new float[NUM_OF_ITERATIONS];
        float cusTotalTax[] = new float[NUM_OF_ITERATIONS];
        float cusTotalTip[] = new float[NUM_OF_ITERATIONS];
        float cusNetTotal[] = new float[NUM_OF_ITERATIONS];

        float averageOrderTotal;
        float averageTipTotal;

        //Order Details
        long ordTicketNum[] = new long[NUM_OF_ITERATIONS];
        int ordNumOfPizzas[] = new int[NUM_OF_ITERATIONS];
        String ordPizzaType[] = new String[NUM_OF_ITERATIONS];
        String ordPizzaSize[] = new String[NUM_OF_ITERATIONS];
        float ordPizzaPrice[] = new float[NUM_OF_ITERATIONS];
        String ordPizzaStyle[] = new String[NUM_OF_ITERATIONS];
        int ordNumOfDrinks[] = new int[NUM_OF_ITERATIONS];
        float priceOfDrinks[] = new float[NUM_OF_ITERATIONS];
        float ordTip[] = new float[NUM_OF_ITERATIONS];
        String ordAllergies[] = new String[NUM_OF_ITERATIONS];


        //Server Ratings
        float cus1Ratings[] = new float[3];
        float cus2Ratings[] = new float[3];
        float cus3Ratings[] = new float[3];

        //Average Rating for Servers
        float svrAverageRating[] = new float[3];



        /*********************************************************
                            INPUT FROM CONSOLE
         *********************************************************/

        //Retrieve Employee Info
        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            Scanner scnr = new Scanner(System.in);

            //Print Header
            System.out.printf("\nEmployee #%d\n", i + 1);

            //Retrieve First Name
            System.out.print("\nFirst Name: ");
            empFirstName[i] = scnr.nextLine();

            //Retrieve Last Name
            System.out.print("Last Name: ");
            empLastName[i] = scnr.nextLine();

            //Retrieve Phone Number
            System.out.print("Phone Number: ");
            empPhoneNum[i] = scnr.nextLine();

            //Retrieve Year of Hiring
            System.out.print("Year of Hiring: ");
            empYearOfHiring[i] = scnr.nextInt();
            scnr.nextLine();

            //Retrieve Position
            System.out.print("Position (Manager/Kitchen Staff/Counter Help): ");
            empPosition[i] = scnr.nextLine();

            //Retrieve Wage
            System.out.print("Wage Rate per Hour: ");
            empWageRate[i] = scnr.nextInt();
            scnr.nextLine();

            //Retrieve Weekly Hours
            System.out.print("Weekly Hours: ");
            empWeeklyHours[i] = scnr.nextInt();
            scnr.nextLine();
        }

        //Retrieve Customer + Order Info
        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            Scanner scnr = new Scanner(System.in);

            //Print Header
            System.out.printf("\nCustomer #%d\n", i + 1);

            //Retrieve First Name
            System.out.print("\nFirst Name: ");
            cusFirstName[i] = scnr.nextLine();


            //Retrieve Last Name
            System.out.print("Last Name: ");
            cusLastName[i] = scnr.nextLine();

            //Retrieve Phone Number
            System.out.print("Phone Number: ");
            cusPhoneNum[i] = scnr.nextLine();

            //Retrieve Time of Order
            System.out.print("Time of Order: ");
            cusTimeOfOrder[i] = scnr.nextLine();

            //Retrieve Order Type
            System.out.print("Order Type (Pick Up/Delivery): ");
            cusOrderType[i] = scnr.nextLine();

            //Retrieve Online Order
            System.out.print("Online Order (Yes/No): ");
            cusOnlineOrder[i] = scnr.nextLine();

            //Retrieve Ticket Number
            System.out.print("Ticket Number: ");
            ordTicketNum[i] = scnr.nextLong();
            scnr.nextLine();

            //Retrieve Number of pizzas ordered
            System.out.print("Number of Pizzas Ordered: ");
            ordNumOfPizzas[i] = scnr.nextInt();
            scnr.nextLine();

            //Retrieve Pizza Type
            System.out.print("Pizza Type (Plain/Meat): ");
            ordPizzaType[i] = scnr.nextLine();

            //Retrieve Pizza Size
            System.out.print("Pizza Size (Large/Small): ");
            ordPizzaSize[i] = scnr.nextLine();

            //Retrieve Pizza Price
            System.out.print("Pizza Price: ");
            ordPizzaPrice[i] = scnr.nextFloat();
            scnr.nextLine();

            //Retrieve Cutting Style
            System.out.print("Cutting Style (Square/Regular): ");
            ordPizzaStyle[i] = scnr.nextLine();

            //Retrieve Drink(s)
            System.out.print("Drink(s) (3$ for each): ");
            ordNumOfDrinks[i] = scnr.nextInt();
            priceOfDrinks[i] = (float) ordNumOfDrinks[i] * 3;
            scnr.nextLine();

            //Retrieve Tip
            System.out.print("Tip (10%, 15%, 20%): ");
            ordTip[i] = scnr.nextFloat();
            scnr.nextLine();

            //Retrieve Allergies
            System.out.print("Allergies (Yes/No): ");
            ordAllergies[i] = scnr.nextLine();
        }

        //Print instructions for Server Reviews
        System.out.println("\nPlease Rate the servers (1-5 stars): ");

        //Retrieve Server Reviews from Customer 1
        for (int i = 0; i < 3; i++) {
            Scanner scnr = new Scanner(System.in);

            //Retrieve Ratings
            System.out.printf("Customer #1, Server #%d: ", i + 1);
            cus1Ratings[i] = scnr.nextFloat();
        }

        //Retrieve Server Reviews from Customer 2
        for (int i = 0; i < 3; i++) {
            Scanner scnr = new Scanner(System.in);

            //Retrieve Ratings
            System.out.printf("Customer #2, Server #%d: ", i + 1);
            cus2Ratings[i] = scnr.nextFloat();
        }

        //Retrieve Server Reviews from Customer 3
        for (int i = 0; i < 3; i++) {
            Scanner scnr = new Scanner(System.in);

            //Retrieve Ratings
            System.out.printf("Customer #3, Server #%d: ", i + 1);
            cus3Ratings[i] = scnr.nextFloat();
        }
        

        /*********************************************************
                			 MANIPULATING INPUT
         *********************************************************/

        //Calculate Employee Financial Values
        totalAnnualSalary = 0;
        averageSalary = 0;

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            //Calc and Assign Employee Experience
            empExperience[i] = CURRENT_YEAR - empYearOfHiring[i];

            //Calc and Assign Employee Weekly Pay
            empWeeklyPay[i] = empWageRate[i] * empWeeklyHours[i];

            //Calc and Assign Employee Annual Salary
            empAnnualSalary[i] = empWeeklyPay[i] * WEEKS_IN_YEAR;

            //Calc and Assign Employee Annual Tax
            empAnnualTax[i] = empAnnualSalary[i] * INCOME_TAX;

            //Calc and Assign Employee NetIncome
            empNetIncome[i] = empAnnualSalary[i] - empAnnualTax[i];

            //Calculate Annual and Average Salary
            totalAnnualSalary += empAnnualSalary[i];
            averageSalary += empAnnualSalary[i];
        }
        //Finish Calculating Employee Average Salary
        averageSalary /= NUM_OF_ITERATIONS;


        //TODO make server ratings more modular || (better use of) arrays
        //Calculate Server Rating Averages
        for (int i = 0; i < 3; i++)
            svrAverageRating[i] = (cus1Ratings[i] + cus2Ratings[i] + cus3Ratings[i]) / 3;


        //Calculate Customer Financial Values
        averageOrderTotal = 0;
        averageTipTotal = 0;

        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            //Calculate Customer Total Before Tax
            cusTotalBeforeTax[i] = ordPizzaPrice[i] + priceOfDrinks[i];

            //Calculate Customer Total Tax
            cusTotalTax[i] = cusTotalBeforeTax[i] * SALES_TAX;

            //Calculate Customer Total Tip
            cusTotalTip[i] = cusTotalBeforeTax[i] * (ordTip[i] / 100);

            //Calculate Customer Total After Tax (and Tip)
            cusNetTotal[i] = cusTotalBeforeTax[i] + cusTotalTax[i] + cusTotalTip[i];

            //Calculate Order and Tip Total Averages
            averageOrderTotal += cusNetTotal[i];
            averageTipTotal += cusTotalTip[i];
        }
        //Finish Calculating Average of Order and Tip Total
        averageOrderTotal /= NUM_OF_ITERATIONS;
        averageTipTotal /= NUM_OF_ITERATIONS;





        /***********************************************************************************
                                     OUTPUT TO CONSOLE
         **********************************************************************************/

        //Print Employee Info
        System.out.println("\nEmployee Information");
        System.out.println("Employee # | Name           | Phone         | Year of Hiring | Position | Wage Rate/hr | Weekly Hours |");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            System.out.printf("%d          | %s | %s    | %d          | %s  | %d            | %d            |\n", (i + 1), empFirstName[i] + " " + empLastName[i], empPhoneNum[i], empYearOfHiring[i], empPosition[i], empWageRate[i], empWeeklyHours[i]);
        }
        //Print Line Divider
        System.out.println("-------------------------------------------------------------------------------------------------------");

        //Print Customer Info
        System.out.println("\nCustomer Information");
        System.out.println("Customer # | Name         | Order Day + Time | Phone     | Order Type | Online Order |");
        System.out.println("--------------------------------------------------------------------------------------");
        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            System.out.printf("%d          | %s  | %s         | %s    | %s      | %s         |\n", (i + 1), cusFirstName[i] + " " + cusLastName[i], cusTimeOfOrder[i], cusPhoneNum[i], cusOrderType[i], cusOnlineOrder[i]);
        }
        //Print Line Divider
        System.out.println("------------------------------------------------------------------------------------------");


        //Print Customer Order Details
        System.out.println("\nCustomer Order Details");
        System.out.println("Customer # | Ticket # | Number of Pizzas | Pizza Type | Pizza Size | Pizza Price | Cutting Style | Drinks | Tip    | Allergies |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < NUM_OF_ITERATIONS; i++) {
            System.out.printf("%d          | %d     | %d              | %s      | %s      | $%.2f      | %s      | $%.2f      | %.2f %% | %s      |\n", (i + 1), ordTicketNum[i], ordNumOfPizzas[i], ordPizzaType[i], ordPizzaSize[i], ordPizzaPrice[i], ordPizzaStyle[i], priceOfDrinks[i], ordTip[i], ordAllergies[i]);
        }
        //Print Line Divider
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        //Print Server Ratings
        System.out.println("\nServer Ratings");
        System.out.println("Customer # | Server #1 | Server #2 | Server #3 |");
        System.out.println("------------------------------------------------");

        //Customer #1
        System.out.printf("%d          | %.1f stars | %.1f stars | %.1f stars |\n", 1, cus1Ratings[0], cus1Ratings[1], cus1Ratings[2]);

        //Customer #2
        System.out.printf("%d          | %.1f stars | %.1f stars | %.1f stars |\n", 2, cus2Ratings[0], cus2Ratings[1], cus2Ratings[2]);

        //Customer #3
        System.out.printf("%d          | %.1f stars | %.1f stars | %.1f stars |\n", 3, cus3Ratings[0], cus3Ratings[1], cus3Ratings[2]);

        //Print Line Divider
        System.out.println("------------------------------------------------\n");



        //Print Employee Financial Info
        for(int i = 0; i < NUM_OF_ITERATIONS; i++)
        {
            //Print Header
            System.out.printf("Employee #%d:\n", i + 1);

            //Print Employee Experience
            System.out.printf("Experience: %d years\n", empExperience[i]);

            //Print Employee Weekly Pay
            System.out.printf("Weekly Pay: $%.2f\n", empWeeklyPay[i]);

            //Print Employee Annual Salary
            System.out.printf("Annual Salary: $%.2f\n", empAnnualSalary[i]);

            //Print Employee Annual Tax
            System.out.printf("Annual Tax: $%.2f\n", empAnnualTax[i]);

            //Print Employee Net Income
            System.out.printf("Net Income: $%.2f\n\n", empNetIncome[i]);
        }

        //Print newline for spacing
        System.out.printf("\n");

        //Print Server Rating Averages
        for(int i = 0; i < 3; i++)
            System.out.printf("Average Rating for Server #%d: %.2f stars\n", i + 1, svrAverageRating[i]);

        //Print newline for spacing
        System.out.printf("\n\n");

        //Print Customer Totals
        for(int i = 0; i < NUM_OF_ITERATIONS; i++)
        {
            //Print Header
            System.out.printf("Customer #%d Order Details:\n", i + 1);

            //Print Customer Total Before Tax
            System.out.printf("Total Before Tax: $%.2f\n", cusTotalBeforeTax[i]);

            //Print Customer Total Tax
            System.out.printf("Total Tax: $%.2f\n", cusTotalTax[i]);

            //Print Customer Total Tip
            System.out.printf("Tip (%.2f %%): $%.2f\n", ordTip[i], cusTotalTip[i]);

            //Print Customer Total After Tax and Tip
            System.out.printf("Total (After Tax & Tip): $%.2f\n\n", cusNetTotal[i]);
        }

        //Print newline for spacing
        System.out.printf("\n");


        //Print Total Annual Salary of Employees
        System.out.printf("Total Annual Salary of Employees: $%.2f\n", totalAnnualSalary);

        //Print Average of Order Totals
        System.out.printf("Average Order Total: $%.2f\n", averageOrderTotal);

        //Print Average Tip Total
        System.out.printf("Average Tips: $%.2f\n", averageTipTotal);

        //Assign and Print Predicted Salary Budget for 20 Staff members
        predictedSalaryBudget = averageSalary * STAFF_TO_PREDICT;
        System.out.printf("Predicted Salary Budget for %d Staff Members: $%.2f\n", STAFF_TO_PREDICT, predictedSalaryBudget);

    }


}
