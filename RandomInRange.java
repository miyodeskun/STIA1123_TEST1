/**
 *
 * @author User
 */
import java.util.Scanner;
public class RandomInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input 1st integer: ");
        int y = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int z = sc.nextInt();
        randomInRange(y,z);
    }
    public static void randomInRange(int y, int z){
        int min, max, ans;
        min = y;
        max = z;
        ans = (int)Math.random()*(max-min+1)+min;
        if (y > z){
            System.out.println("0");
        }
        else
        System.out.println("The random integer from " + y + " and " + z + " is: "
        + ans);   
    }
    
}
