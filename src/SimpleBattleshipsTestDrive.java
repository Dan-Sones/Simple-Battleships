import java.util.Scanner;

public class SimpleBattleshipsTestDrive {
    public static void main (String[] args){
        // sets up scanner object
        Scanner reader = new Scanner(System.in);
        //set up some variables and create objects
        int numOfGuesses = 0;
        boolean isAlive = true;
        SimpleBattleship battleship = new SimpleBattleship();
        //Generate a random number that is equivilent to the cell
        int randomnum = (int) (Math.random() * 5);
        // fill in the random cell and plus one and then two
        int [] locations = {randomnum, randomnum + 1, randomnum + 2};
        battleship.setLocationCells(locations);

        while (isAlive == true){
            System.out.println("Where do you guess? (Potential positions start at zero)");
            String guess = reader.nextLine();
            String result = battleship.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " hits to down the battleship");
            }
        }

    }
}
