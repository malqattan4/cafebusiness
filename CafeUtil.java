import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil{

    //write a method that sums together every consecutive integer from 1 to 10 and returns the sum. 
    public int getStreakGoal(){
        int sum=0;
        for (int i=0; i<=10; i++){
            sum+= i;
        }
        return sum;
    }

    //Given an array of item prices from an order, 
    //sum all of the prices in the array and return the total. 
    public double getOrderTotal(double[] prices){
        double sum=0.0;
        for (int i=0; i<prices.length; i++){
            sum+=prices[i];
        }
        return sum;
    }


    //Given an ArrayList of menu items (strings), print out each index and menu item. 
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " +menuItems.get(i));
        }
    }

    
    //Add customer and display greeting and people ahead
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, "+userName+ "!");
        System.out.println("There are " +customers.size() +" people in front of you");
        customers.add(userName);
        System.out.println(customers);


    }




}