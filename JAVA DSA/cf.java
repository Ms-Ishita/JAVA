//code forces question find maximu day cover  b journey 

import java.util.Scanner;

public class cf {  

    public static void tippiTroppi(String str){
        StringBuilder st= new StringBuilder(" ");
        String[] words = str.trim().split("\\s+");
        StringBuilder s =  new StringBuilder("");
        for(String word : words){
            if(!word. isEmpty()){
                s.append(word.charAt(0));
            }
        }
        System.out.println(s.toString());

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // First input: number of test cases
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t-- > 0) {
            String input = scanner.nextLine();
            tippiTroppi(input);
        }

        scanner.close();
    }
}
        

