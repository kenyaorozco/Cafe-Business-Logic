import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil{


    public int getStreakGoal( ){
        // declare our sumTotal as a var 
        int sumTotal = 0;
        for ( int i = 0; i<= 10; i++){
            // created a for loop where the Idx of i is our starting point
                sumTotal = sumTotal + i;
                // where the numbers being to add
            }
        return (sumTotal);
        }


    public void printPriceChart(String product, double price, int maxQuantity){
    }

    public double getOrderTotal(double []prices){
        double priceTotal = 0.0;
        for ( int p = 0; p <prices.length; p++){
            priceTotal += prices[p];
        }
        return priceTotal;

    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("There are " + (customers.size()-1) + " people ahead of you");
        System.out.println(customers);

    }

    public void displayMenu(ArrayList<String> menuItems){
        for ( int m = 0; m<menuItems.size(); m++){
            String name = menuItems.get(m);
            System.out.println(m + " " + name);
        }

    }

}