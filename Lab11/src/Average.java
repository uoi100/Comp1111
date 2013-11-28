import java.util.ArrayList;

/** <p> Accepts command line arguments, and averages numbers
 * from the command line argument. </p>
 * 
 * @author Calvin Truong
 * @version 1.0
 */
 
public class Average {

    /**<p> The main method, it reads the command line
     * arguments for computing the average. </p>
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numArgs = new ArrayList<Integer>();      // array list to store arguments
        double average = 0;     // average of the numbers
        int count = 0;      // counter
        // read in command line arguments
        for(String e : args) {
            numArgs.add(Integer.parseInt(e));
        }
        
        // compute
        for(Integer e : numArgs) {
            count++;
            average += e;
        }
        
        average = average / (double) count;
        
        if (count != 0)
            System.out.println("Average is: " + average);
        else
            System.out.println("No arguments!");
    }

}
