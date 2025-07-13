import java.io.*;
public class filehand5 {
    public static void main(String[] args) {
        File file = new File("exp.txt");
        if(file.delete()){
            System.out.println("deleted the file: "+file.getName());
        }else{
            System.out.println("failed");
        }
    }
}
