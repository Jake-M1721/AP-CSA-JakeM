package starsassignment;

public class StarsAssignment {

    public static void main(String[] args)
    {
        final int MAX_ROWS = 10;
        System.out.println("a.");
        //rows go from 1 to 10
        for (int row = 1; row <= MAX_ROWS; row++)
        {
            //stars start at 10 and decrease while greater than or equal to row
            for (int star = 10; star >= row; star--){
                System.out.print("*");
            }
            //newline for each new row
            System.out.println();
        }
    
        
        System.out.println("b.");
        
        for (int row = 1; row <= MAX_ROWS; row++){
            
            //prints spaces until it reaches the place where the star should be
            for (int space = 1; space <= MAX_ROWS - row; space++){
                System.out.print(" ");
            }
        
            //print out the appropriate number of stars for that row
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            //newline for a new row
            System.out.println();
        }
        
        System.out.println("c.");
        
        for (int row = 1; row <= MAX_ROWS; row++){
            
            //prints spaces, starting with zero and increasing until 9
            for (int space = 1; space <= row - 1; space++){
                System.out.print(" ");
            }
            // prints stars starting with 10 and decreasing until 1
            for (int star = 10; star >= row; star--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("d.");
        final int MID_ROW = 5;
         for (int row = 1; row <= MID_ROW; row++){
             
            //print spaces for top triangle
            for (int space = 1; space <= MID_ROW - row ; space++){
                System.out.print(" ");
            }
            //print stars for top triangle
            for (int star = 1; star <= row*2 -1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
         for (int row = 1; row <= MID_ROW; row++){
             
            //print spaces for bottom triangle
            for (int space = 1; space <= row - 1 ; space++){
                System.out.print(" ");
            }
            //print stars for bottom triangle
            for (int star = 9; star >= row*2 -1; star--){
                System.out.print("*");
            }
            System.out.println();
}
}
}     
        
        
    