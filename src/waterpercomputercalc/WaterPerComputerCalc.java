/*
 *  William Zwart
 *  4/10/18
 *  Calculating the amount of water used to make the amount of computers and moniters you have.
 */

package waterpercomputercalc;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class WaterPerComputerCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        //Variable(s)
        double computerAndMoniterAmount;
        double answer;
        //Input amount of computer and moniter combinations
        System.out.print("Enter the amount of computer and computer moniter combinations: ");
        computerAndMoniterAmount = keyedInput.nextDouble();
        answer = computerAndMoniterAmount * 1.5;
        System.out.println("The amount of water used to create your computers and moniters was: " + answer + " tons.");
        keyedInput.close();
    }
    
}