import java.io.*;
import java.util.Scanner;
public class filehand3 {
    public static void main(String[] args) {
        try{
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            int wordCount =0;
            while(sc.hasNextLine()){
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
            }
                System.out.println(wordCount);
                sc.close();
            } 
        
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
