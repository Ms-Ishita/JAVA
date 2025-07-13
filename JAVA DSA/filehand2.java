import java.io.*;


public class filehand2 {
    public static void main(String[] args) {
        
    
    try{
        FileWriter write = new FileWriter("exp.txt");
        write.write("hello this is a test file");
        write.close();
        System.out.println("successfully wrote to the file");
    }
    catch(IOException e){
        System.out.println("An error occured .");
        e.printStackTrace();
    }
    
}
}
