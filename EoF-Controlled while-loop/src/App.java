import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner READ_FILE = new Scanner(new FileReader("Test_Scores.txt")); // INPUT object
        PrintWriter FINAL_FILE_OUTPUT = new PrintWriter("Test_Score_Grade.txt"); //OUTPUT object

        String fName, lName;
        double score;
        char fGrade = ' ';
        int counter = 0;

        while (READ_FILE.hasNext()) {
            fName = READ_FILE.next();//scan the String file by next() method
            lName = READ_FILE.next();
            score = READ_FILE.nextDouble(); //scan the double file like grade  by nextDouble method

            counter++; //this keep adding 1 if there is a file read.

            switch ((int) score / 10) {//divides the score by 10 and returns 0 - 10 as the bases of grade
                case 0:
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                    fGrade = 'F';
                    break;
                case 6:
                    fGrade = 'D';
                    break;
                case 7:
                    fGrade = 'C';
                    break;
                case 8:
                    fGrade = 'B';
                    break;
                case 9:
                case 10:
                    fGrade = 'A';
                    break;
                default:
                    FINAL_FILE_OUTPUT.print(fName + " " + lName + " Bagsak kang bata ka...!");
                    break;
            }

            FINAL_FILE_OUTPUT.println(fName + " " + lName + " Score: " + score + "\n Grade: " + fGrade);//this keeps outputing/recording while the loop is running
        }

        if (counter == 0) //if the counter did not move/iterate it means the file was empty
            System.out.println("No data that has been scanned/read!");

        FINAL_FILE_OUTPUT.close(); //after the loop is finished, close this object and create the file.

    }
}
