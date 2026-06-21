package javaCafe;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        CafeUtil cafeUtil = new CafeUtil();

        ArrayList<String> cust = new ArrayList<String>();
            cafeUtil.addCustomers(cust);

        cafeUtil.printPriceChart("coffee",6.00,6);
        ArrayList <String> items = new ArrayList<String>();
        items.add("coffee");
        items.add("mocha");
        items.add("tea");

        ArrayList <Double> order = new ArrayList<Double>();
        order.add(4.33);
        order.add(2.11);
        order.add(9.54);
        cafeUtil.displayMenu(items,order);

        System.out.println("\n----- Streak Goal Test -----");
        int result = cafeUtil.getStreakGoal();

        System.out.println(result);
        System.out.println("\n----- Order Total Test -----");


        double[] lineItems = {3.5, 1.5, 4.0, 4.5};

        double total = cafeUtil.getOrderTotal(lineItems);

        System.out.println(total);

        ArrayList<String> menu = new ArrayList<String>();

        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");

        cafeUtil.displayMenu(menu);
        System.out.println("\n----- Display menu -----");

         System.out.println("\n----- Add Customer Test-----");
         ArrayList<String> customers = new ArrayList<String>();
          for (int i = 0; i < 4; i++) {
              cafeUtil.addCustomer(customers);
              System.out.println("\n");

          }
    }
}
//         System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        // System.out.println("----- Display Menu Test-----");
        
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.add("drip coffee");
        // menu.add("cappuccino");
        // menu.add("latte");
        // menu.add("mocha");
        // appTest.displayMenu(menu);
    
        // // --- Test 4 times ---
        // }
    

        
    
