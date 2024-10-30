import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Problem: You are given a long string containing multiple hidden words.
 * Write a function that finds and prints
 * the word hidden between two markers ("*" and "~").
 * Identify the song hidden in the text!
 */


public class C2_HiddenWordHardMode {

    public static void main(String[] args) {
        C2_HiddenWordHardMode c = new C2_HiddenWordHardMode();
    }

    public C2_HiddenWordHardMode() {
        findHiddenLyrics("hidden_lyrics.txt");
    }

    public void findHiddenLyrics(String fileName) {

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                /* TODO: your code goes here */
                for (int x=0; x<line.length();x++){
                    if(line.contains("*")) {
                        if (x == line.indexOf("*")+1) {
                            String hiddenWord = line.substring(x, line.indexOf("~"));
                            System.out.print(hiddenWord+" ");
                        }
                    }
                }


            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println();
        System.out.println("The song is Ameriican Requiem by Beyonce!");
    }

}
