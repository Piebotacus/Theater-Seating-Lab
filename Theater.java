
import edu.kzoo.grid.TextCell;
import java.util.ArrayList;
;
/**
 *  Theater Seating Chart Lab: Theater
 *
 * Purpose: Uses a two-dimensional array to represent 
 * the seating arrangement of customers in a theater. The seats in the theater 
 * are in a rectangular arrangement of rows and columns.
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
public class Theater 
{
    private Customer[][] seats;

    /* *  Creates a Theater seating chart with the given number of rows and columns 
     *  from the Customers in customerList. Empty seats are represented by null.
     *
     *  @param rows the number of rows of seats in the theater
     *  @param cols the number of columns of seats in the theater
     *  @param customerList The customers to be given seats in the theater

     *  Precondition: rows > 0; cols > 0;
     *             rows * cols >= customerList.size()
     *  Postcondition:
     *    - Customers appear in the seats in the same order as they appear in
     *      customerList, starting at seats[0][0], and seats is filled row by row from
     *      customerList, followed by any empty seats (represented by null).
     *        OR
     *      Customers are placed in the seats in random order, with empty seats null
     *    - customerList is unchanged.
     */    
    public Theater(int rows, int cols, ArrayList<Customer> customerList) 
    {
        // Construct the seats 2D array
        int count = 0;
        int x;
        int y;
        Customer[][] seats = new Customer[rows][cols];
        for(Customer cus : customerList){
            x = (int) (Math.random())*cols;
            y = (int) (Math.random())*rows;
            if(seats[x][y] == null){
                seats[x][y] = cus;
                count++;
            }
        }

    }

    /* *  Creates a Theater seating chart with the given number of rows and columns 
     *  from the Customers in customerList. Empty seats are represented by null.
     *
     *  @param rows the number of rows of seats in the theater
     *  @param cols the number of columns of seats in the theater
     *  @param customerList The customers to be given seats in the theater
     *  @param cushion indicates how far apart customers should be seated

     *  Precondition: rows > 0; cols > 0;
     *             rows * cols >= customerList.size()
     *  Postcondition:
     *    - Customers appear in the seats in the same order as they appear in
     *      customerList, starting at seats[0][0], and seats is filled row by row from
     *      customerList, followed by any empty seats (represented by null).
     *        OR
     *      Customers are placed in the seats in random order, with empty seats null
     *    - customerList is unchanged.
     */    
    public Theater(int rows, int cols, ArrayList<Customer> customerList, int cushion) 
    {
        // Construct the seats 2D array
        int count = 0;
        Customer[][] seats = new Customer[rows][cols] ;
        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j+=cushion) {
                if(seats[i][j] == null){
                    seats[i][j] = customerList.get(count);
                    count++;
                }
            }
        }
    }

    /* This method should return true if the seat is occupied, false otherwise.
     */ 
    public boolean isSeatOccupied(int row, int col)
    {
        if(seats[row][col] != null)
            return false;
        return true;
    }

    /* This method should return the row number with the greatest number of occupied seats
     */
    public int findMostOccupiedRow()
    {
        
        int count = 0;
        int highest = 0;          
        for(int i = 0; i < seats.length;i++) {
            for(int j = 0; j < seats[i].length; j++) {
               if(seats[i][j] != null){
                   count++;
               }
               highest = count;
               if(count > highest){
                   highest = count;
               }
            }
        }
        return highest;
    }


    /* This method should return the tallest customer in the theater
     */
    public Customer getTallestCustomer()
    {
        Customer tallest = null;    // Set to null since a random placement means seat[0][0] could be null

        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                if(tallest != null){
                    if(seats[i][j].getHeight()>tallest.getHeight()){
                        tallest = seats[i][j];
                    }
                }
            }
        }
        return tallest;
    }    

    /* This method should return a list of Customers who need to have their seats moved
     * because there is someone more than 3 inches taller than them sitting directly
     * in front of them (one row closer, but in the same seat).
     *
     * This method does not actually change any seats, but constructs and returns a NEW 
     * arrayList filled with customers who have someone sitting in front of them that 
     * is more than 3 inches taller than they are.
     */
    public ArrayList<Customer> getCustomersToBeMoved()
    {
        ArrayList<Customer> moveList = new ArrayList<Customer>();

        return moveList;
    }

    /* This method returns a String that can be used to print out the contents 
     * of the seats in the theater
     */
    public String toString()
    {
        String output="";

        for (int r = 0; r < seats.length; r++)
        {
            output = output + "[" + r +"] ";
            for (int c = 0; c < seats[r].length; c++)
            {
                if (seats[r][c] == null)
                    output = output + "<empty>        ";
                else
                    output = output + seats[r][c];
            }
            output = output + "\n";
        }
        return output;
    }    

    /* This method creates a grid representation of the contents 
     * of the seats in the theater
     */    
    public void displayTheaterSeatingChart()
    {

        // Create and initialize the grid.
        TheaterGrid grid = new TheaterGrid(2, 2);

        // Create graphical user interface capable of displaying
        // the grid.  The 2nd, 3rd, and 4th parameters are used to
        // create an appropriate Help menu.
        TheaterObjectGUI display = new TheaterObjectGUI(grid,
                "John Doe", "Kelly Schultz",
                "12 Feb 2021");

        TextCell seat = new TextCell("0");
        grid.add(seat, 0, 0);

        display.showGrid();
    }
}