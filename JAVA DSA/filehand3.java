import java.io.*;
import java.util.Scanner;
public class filehand3 {//to read data from a file
    public static void main(String[] args) {
        try{
            File file = new File("exp.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);

            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
