import java.io.*;
public class fileStr {
    public static void main(String[] args) {
        try{
            FileInputStream inp = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt", true);
            int data;
            while((data=inp.read())!=-1){
                out.write(data);
            }
            inp.close();
            out.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
    
