package stia1123_test1;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class NewClass2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st word (string): ");
        String x = sc.nextLine();
        System.out.print("Input 2nd word (string): ");
        String y = sc.nextLine();
        
        if(x.equals(y))
            System.out.println("The 1st & 2nd string is EQUAL.");
        else
            System.out.println("The 1st & 2nd string NOT EQUAL.");
    }
    
}
