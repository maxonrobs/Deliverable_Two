import java.util.Scanner;
public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int correctCount = 0;
		int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Which will be more: heads or tails? ");
        String headsOrTailsGuess = scnr.nextLine();
         
        System.out.print("How many times will the coin be flipped? ");
        int numberOfFlips = scnr.nextInt();
        System.out.print("\n");
        
         
        while(counter <= numberOfFlips)
        {
            randNum = Math.random();
            
             
            if(randNum < .5)
            {
                heads++;
                System.out.println("heads");
            }
            else
            {
                tails++;
                System.out.println("tails");
               }
            counter++;      
        }
        if(headsOrTailsGuess.equalsIgnoreCase("heads"))
        {
        	correctCount = heads++;
        	
        }
        if(headsOrTailsGuess.equalsIgnoreCase ("tails"))
        {
        	correctCount = tails++;
        }
        int x = correctCount;
        int y = numberOfFlips;
        int z = (x * 100) / y;
        
        System.out.print("\nYour guess, " + headsOrTailsGuess + ", came up " + correctCount + " time(s).\n"
        		+ "Thats " + z + "%");
       
        
         
         
         
    }

	}

