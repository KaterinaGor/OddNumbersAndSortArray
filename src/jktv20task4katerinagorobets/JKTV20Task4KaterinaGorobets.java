
package jktv20task4katerinagorobets;

import java.util.Arrays;
import java.util.Random;


public class JKTV20Task4KaterinaGorobets {


    public static void main(String[] args) {
        int[] myArray = new int[100];
        System.out.println("Odd numbers: ");
        for (int i=0; i<myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(100)|1;
            
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(myArray[i] + " ");   
        }
        
        System.out.println(" ");
        int[] numbersCopy = Arrays.copyOf(myArray, myArray.length);
        Arrays.sort(numbersCopy);
        System.out.println("Sorted odd numbers:");
        for (int i=0; i<numbersCopy.length; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(numbersCopy[i] + " ");   
        }
        
        
        double average1 = 0;
        for (int i=0; i<myArray.length; i++) {
            average1 += myArray[i];
        }
        average1 /=100;
        System.out.println("Average: " + average1);
        
    }
    
}
