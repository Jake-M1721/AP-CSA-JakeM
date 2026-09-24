package randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
/**
* @param args the command line arguments
*/
public static void main(String[] args){
    System.out.println("Press p to generate a random phone number or r to roll dice");
    Scanner scan = new Scanner(System.in);
    String input = scan.next();
    Random generator = new Random();
while (!input.equals("-1")){
    while(input.equals("p")){                   
            int num1;
            int num2;
            int num3;
            
            num1 = generator.nextInt(8);
            num2 = generator.nextInt(8);
            num3 = generator.nextInt(8);
            
            int middleSect;
            middleSect = generator.nextInt(655);
            
            String middlePart = String.format("%03d", middleSect);
            
            int finalSect;
            finalSect = generator.nextInt(10000);
            
            String finalPart = String.format("%04d", finalSect); 
            
            System.out.println(num1 + "" + num2 + "" + num3 + "-" + middlePart + "-" + finalPart);   
            input = scan.next();
    }
        
     

        

    while (input.equals("r")) {
        
        

        System.out.println(generator.nextInt(6) + 1);
        System.out.println("Press r to roll the dice or p to generate phone number"); 
        input = scan.next();
        
        }
    }
    }
}

        
    

     
 