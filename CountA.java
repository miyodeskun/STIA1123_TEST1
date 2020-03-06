/**
 *
 * @author Amirul Luqman
 */
import java.util.Scanner;
public class CountA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a word: ");
        String x = sc.next();
        countA(x);
    }
    public static void countA(String x){
        char someChar = 'A';
        int count = 0;
        
        for(int i=0; i<x.length();i++){
            if(x.charAt(i)==someChar){
                count++;
            }
        }
        System.out.println("Total 'A' letters: " + count);
    }    
}
