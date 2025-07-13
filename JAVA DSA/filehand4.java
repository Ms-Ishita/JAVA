import java.io.*;
public class filehand4 {
    public static void main(String[] args) {// append in a file
        try{
            FileWriter write = new FileWriter("exp.txt", true);
            write.write("\n this is appended text");
            write.close();
            System.out.println("successfully appended to file ");


        }
        catch(IOException e){
            System.out.println("An error occurded");
            e.printStackTrace();
        }
    }
    
}
