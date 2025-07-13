import java.io.File;
import java.io.IOException;
public class filehand {

    public static void main(String[] args) {
        try{
            File file = new File("exp.txt");
            if(file.createNewFile()){
                System.out.println("file is created " + file.getName());
            }
            else{
                System.out.println("File is already created");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

