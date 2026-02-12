import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main {

   public static void main(String []args) throws IOException {
      // Create, File, Scanner, and String[] Objects
      File myFile = new File("pokemon.csv");
      Scanner scan = new Scanner(myFile);
      String[] pokemonLines = new String[152];
      //initialize a line counter
      int i = 0;
      while(scan.hasNext() && (i < 152)){
         // read in the next line from the file
         String currentLine = scan.nextLine();
         // assign the line to be stored in the array
         pokemonLines[i] = currentLine;
         // print out that line from the Array
         System.out.println(pokemonLines[i]);
         // Increment line counter
         i++;
      }
      randomPokemon(pokemonLines.length, pokemonLines);
      
   }
   public static void randomPokemon(int lenghth, String[] pokemonLines){
         // generat random in from 1 to array lenth
         int randIndex = (int) (Math.random()*lenghth+1);
         System.out.println(randIndex);
         String randPokeLine = pokemonLines[randIndex];
         System.out.println(randPokeLine);
      }
}

