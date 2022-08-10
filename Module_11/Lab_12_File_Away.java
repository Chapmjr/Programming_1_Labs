package Module_11;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JPanel;



public class Lab_12_File_Away {



    public static void main(String[] args) throws FileNotFoundException {



        // lines holds the number
        //   of lines in the file
        // set lines to 0
        // words holds the number
        //   of words in the file
        // set words to 0
        // characters holds the number
        //   of characters in the file
        // set characters to 0
        // input holds the File instance
        //   of the file
        int lines = 0;
        int words = 0;
        int characters = 0;
        File inputFile;



        // use JFileChooser to get the
        //   name of the input file
        // make an instance of JFileChooser
        //   and save it to aJFileChooser
        // call showSaveDialog of
        //   aJFileChooser and use a new
        //   instance of JPanel as parameter
        //   save result to result
        // if result is APPROVE_OPTION of
        //   JFileChooser
        //   file is selected
        //   call getSelectedFile of
        //     aJFileChooser and save it
        //     to inputFile
        //   otherwise no file selected
        //     display error message
        //     and end program
        JFileChooser aJFileChooser = new JFileChooser();
        int result = aJFileChooser.showSaveDialog(new JPanel());
        if (result == JFileChooser.APPROVE_OPTION)
        {
            inputFile = aJFileChooser.getSelectedFile();
        }
        else
        {
            System.out.println("Error: no input file selected");
            return;
        }



        // there are MANY ways to read a file
        // I CHOOSE Scanner
        // aScanner is a Scanner object
        //   instantiate aScanner with inputFile
        //    as parameter
        // loop while hasNextLine of
        //    aScanner is true
        Scanner aScanner = new Scanner(inputFile);
        while (aScanner.hasNextLine()) {



            // call nextLine if aScanner and
            //   save it to line
            // wordsArray holds the words
            //   in a line
            // call split with space as delimiter
            //   and save it to line
            // increment lines
            // go through each element of wordsArray
            //   using ctr as index
            String line = aScanner.nextLine();
            ++lines;
            String[] wordsArray = line.split(" ");
            for (int ctr = 0; ctr < wordsArray.length; ++ctr) {



                // if wordsArray of ctr is not null
                //   and not an emprt string
                //   wordsArray of ctr is a valid word
                //   increment words
                if ((wordsArray[ctr] != null) &&
                        (wordsArray[ctr].length() > 0)) {
                    ++words;
                }
            }



            // outside the for loop
            // get length of line and
            //   add it to characters
            characters += line.length();
        }



        // outside the while loop
        // close aScanner
        aScanner.close();



        // call getName of inputFile
        //   and display the name
        //   of input file
        // display the number of lines,
        //   words and characters
        System.out.println("The name of the file: " + inputFile.getName());
        System.out.println("Number of lines in the file: " + lines);
        System.out.println("Number of words in the file: " + words);
        System.out.println("Number of characters in the file: " + characters);
    }
}



