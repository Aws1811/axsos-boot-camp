package javaCafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
	public static void main(String[] args) {
	}

	public int getStreakGoal() {
		System.out.print("input your number :" );
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;
		for (int i =1 ; i<=n ; i++) {
			sum+=i ;
		}
		System.out.println("your result is :" + sum);
		scanner.nextLine();
		return sum;

	}
	public double getOrderTotal(double[] lineItems) {

		double x= 0;
		for (int i=0; i < lineItems.length  ; i++) {
			x+= lineItems[i];
		}
		return x ;
	}
	public void displayMenu(ArrayList<String> menuItems) {

	    for (int i = 0; i < menuItems.size(); i++) {
	        System.out.printf("%d %s%n", i, menuItems.get(i));
	    }
	}
	public void addCustomer(ArrayList<String> customers) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String username = scanner.nextLine();
		System.out.print("Hello " + username);
		System.out.printf("There are %d people are in front of" ,customers.size());
		customers.add(username);
	}
	public  void printPriceChart(String product, double price , int maxQuntity) {
		double actualPrise;
		for (int i = 1; i <= maxQuntity; i++) {
			if (i > 1) {
				 actualPrise = (price * i)  - (i*0.50 -0.5);
			} else {
				 actualPrise =price*i;
			}
			System.out.printf("%s  - of %s will me  %s sir %n", i, product, actualPrise);
		}
	}
	public boolean displayMenu(ArrayList<String> menuItems,ArrayList<Double> prices){
		if(menuItems.size() != prices.size()){
			return false;
		}
		for(int i = 0 ; i<menuItems.size() ; i ++ ){
			String showCase = String.format("%d - %s ➜ %.2f $ %n" ,i,menuItems.get(i),prices.get(i));
			System.out.println(showCase);
		}
		return true;
	}
	public void addCustomers(ArrayList<String> name){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		while(!scanner.nextLine().equals("q")){
			name.add(input);
			input = scanner.nextLine();

		}
	}
}
