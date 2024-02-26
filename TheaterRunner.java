
import java.util.ArrayList;

/**
 *  Theater Seating Chart Lab:<br>
 *
 * Purpose: This program tests the Theater class by making an ArrayList of 
 * Customers, making a Theater object, calling the methods & 
 * printing the results. It will also display the results graphically
 *
 *  @author Tim Gallagher
 *  @author Kelly Schultz and Alyce Brady
 *  @version 12 Feb 2021
 * 
 * @author [your name]
 * @author [with assistance from ... (including instructor/TAs)]
 * @author [working side-by-side with ...]
 * @version 12 Feb 2021 [you should change this]
 */
public class TheaterRunner {

    public static void main(String[] args)
    {
    	ArrayList<Customer> customerList1 = new ArrayList<Customer>();
    	
    	customerList1.add(new Customer("C", "Vivienne",74));
    	customerList1.add(new Customer("H", "Lucas",65));
    	customerList1.add(new Customer("J", "Ethan",62));
    	customerList1.add(new Customer("L", "David",70));
    	customerList1.add(new Customer("S", "David",76));
    	customerList1.add(new Customer("M", "Aryaman",60));
    	customerList1.add(new Customer("S", "Clara",68));
    	customerList1.add(new Customer("K", "Jordyn",64));
    	customerList1.add(new Customer("K", "Leo",63));
    	customerList1.add(new Customer("C", "Kaleb",60));
    	customerList1.add(new Customer("F", "Rand",72));
    	customerList1.add(new Customer("A", "Adam",62));
    	customerList1.add(new Customer("R", "Ashley",64));
    	customerList1.add(new Customer("S", "Kelly",68));
    	customerList1.add(new Customer("S", "Martin",59));
    	customerList1.add(new Customer("S", "Alec",78));
    	customerList1.add(new Customer("S", "Nathan",54));
    	customerList1.add(new Customer("J", "Nan",70));
    	
    	Theater theater1= new Theater(4,7,customerList1);
    	
    	System.out.println("Theater #1:");
    	System.out.println(theater1);
    	System.out.println("Most Occupied Row:" + theater1.findMostOccupiedRow());
        System.out.println();
    	System.out.println("People to be moved:");
    	for(Customer c : theater1.getCustomersToBeMoved())
    		System.out.print(c);
    	System.out.println();
    	System.out.println();
    	System.out.println("Tallest customer: " + theater1.getTallestCustomer());
    	System.out.println();
    	System.out.println();
    	
    	theater1.displayTheaterSeatingChart();
    	
    	ArrayList<Customer> customerList2 = new ArrayList<Customer>();
    	
    	customerList2.add(new Customer("C", "Vivienne",72));
     	customerList2.add(new Customer("H", "Lucas",68));
    	customerList2.add(new Customer("J", "Ethan",77));
    	customerList2.add(new Customer("L", "David",70));
    	customerList2.add(new Customer("S", "David",70));
    	customerList2.add(new Customer("M", "Aryaman",64));
    	customerList2.add(new Customer("S", "Clara",66));
    	customerList2.add(new Customer("K", "Jordyn",70));
    	customerList2.add(new Customer("K", "Leo",70));
    	customerList2.add(new Customer("C", "Kaleb",67));
    	customerList2.add(new Customer("F","Rand",68));
    	customerList2.add(new Customer("A", "Adam",77));
    	customerList2.add(new Customer("R", "Ashley",78));
    	customerList2.add(new Customer("S", "Kelly",71));
    	customerList2.add(new Customer("S", "Martin",65));
    	customerList2.add(new Customer("S", "Alec",66));
    	customerList2.add(new Customer("S", "Nathan",74));
    	customerList2.add(new Customer("J","Nan",70));
    	customerList2.add(new Customer("C", "Becky",72));
    	customerList2.add(new Customer("E", "Monty",66));

    	Theater theater2= new Theater(8,7,customerList2,3);
    	
    	System.out.println("Theater #2:");
    	System.out.println(theater2);
    	System.out.println("Most Occupied Row:" + theater2.findMostOccupiedRow());
        System.out.println();
    	System.out.println("People to be moved:");
    	for(Customer c : theater2.getCustomersToBeMoved())
    		System.out.print(c);
    	System.out.println();
    	System.out.println();
    	System.out.println("Tallest customer: " + theater2.getTallestCustomer());
    	System.out.println();
    	
    	theater2.displayTheaterSeatingChart();
    }
    
    
}