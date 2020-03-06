
/**
 *
 * @author Amirul Luqman
 */
import java.util.Scanner;
public class PrintReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a word: ");
        String x = sc.next();
        printReverse(x);
    }
    public static void printReverse(String x){
            for(int i = x.length()-1; i>=0; i--){
                System.out.print(x.charAt(i));
            }
            System.out.println("");   
    }   
}
