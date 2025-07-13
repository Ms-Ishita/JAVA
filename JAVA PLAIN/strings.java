public class strings {
    // public static String compressTheString(String str, StringBuilder str2){
    //     int i = 0;
    //     if(i == str.length()-1){
    //        // return str.charAt(i)+
    //     }
    //     // int count = 1;
        
    //     // for(int i =1; i<str.length();i++){
    //     //     if(str.charAt(i)==str.charAt(i-1)){
    //     //         count++;
    //     //     }
    //     //     else{
    //     //         str2.append(str.charAt(i-1));
    //     //         str2.append(count);
    //     //         count =1;
    //     //     }
    //     // }

    //     // str2.append(str.charAt(str.length()-1));
    //     // str2.append(count);

    //     // return str2.toString();


    // }
   public static void main(String[] args) {

    String str = new String("aaabbbcccc");
    StringBuilder str2 = new StringBuilder("");
    ///System.out.println(compressTheString(str, str2));


    // String str = "hello world is the best";
    // StringBuilder str2 = new StringBuilder("");
    // int e = (str.charAt(0)==' '?0:1);
    // if(e==1){
    //     str2.append(Character.toUpperCase(str.charAt(0)));
    // }
    // for(int i = e; i<str.length();i++){
    //     if(str.charAt(i)==' '){
    //         str2.append(str.charAt(i));
    //         i++;
    //         str2.append(Character.toUpperCase(str.charAt(i)));
    //         continue;
    //     }
    //     str2.append(str.charAt(i));
    // }
    // System.out.println(str2);

    // String b = "ishita";
    // String c = a;


    // System.out.println(a==c);
    // String name1 = new String("ishita");
    // String name2 = new String("ish");


    // System.out.println(name1==name2);
    // System.out.println(name1.equals(name2));

    

  
    // StringBuilder str2 = new StringBuilder();
    // str2.append(Character.toUpperCase(str.charAt(0)));
    // for(int i = 1; i<str.length();i++){
    //     if(str.charAt(i)==' '){
    //         str2.append(str.charAt(i));
    //         i++;
    //         str2.append(Character.toUpperCase(str.charAt(i)));
    //         continue;
    //     }
    //     str2.append(str.charAt(i));
    // }
    // System.out.println(str2);

    
    

    // String str = "hello world is the best";
    // String[] str1 = str.split(" ");
    // for(int i = 0; i<str1.length; i++){
    //     str1[i] = str1[i].substring(0, 1).toUpperCase() + str1[i].substring(1);
    // }
    // for (String string : str1) {
    //     System.out.print(string+" ");
    // }
}
}
    

    // public static void main(String[] args) {
    //     int max =0;
    //     String[] str = new String[]{ "orange", "banana", "mango", "grapes" };
    //     for (int i = 0; i < str.length; i++) {
    //         if (str[max].length()<str[i].length()) {
    //             max = i;
    //         }
    //     }
    //     System.out.println(str[max]);
        
    // }


// import java.lang.Math;
// public class strings {

//     public static int shortestPath(String str, int i, int x, int y) {
        
//         if (i == str.length()) {
//             return (int) Math.sqrt(x * x + y * y);
//         }
       
//         if (str.charAt(i) == 'W') {
//             y--;
//         }
//         if (str.charAt(i) == 'E') {
//             y++;
//         }
//         if (str.charAt(i) == 'N') {
//             x--;
//         }
//         if (str.charAt(i) == 'S') {
//             x++;
//         }
        
       
//         return shortestPath(str, i + 1, x, y);
//     }

//     public static void main(String[] args) {
//         String str = "WNEENESENNN";
//         int i = 0;
//         int x = 0;
//         int y = 0;

        
//         System.out.println(shortestPath(str, i, x, y));
//     }
// }


    // public static boolean Palindrome(String str, int s, int e){
       
    //     if(s>=e){
    //         return true;
    //     }
    //     if(str.charAt(s)!=str.charAt(e)){
    //         return false;
    //     }
    //     return Palindrome(str, s+1, e-1);
    // }
    // public static void main(String[] args) {
    //     String str = "abcba";
    //     int s = 0;
    //     int e = str.length()-1;
    //     System.out.println(Palindrome(str, s, e));
    // }
 

// import java.util.Scanner;

// public class str {
//     public static void main(String[] args) {
//         // String str1 = "abcd";
//         // String str2 = new String("abcd");
//         Scanner sc = new Scanner(System.in);
//         String name ;
//         name = sc.nextLine();
//         System.out.println(name);
//         System.out.println(name.length());
//         System.out.println(name.charAt(0));
//         String name2 ;
//         name2 = sc.nextLine();
//         System.out.println(name2);
//         System.out.println(name+" "+name2);//concatenation
//         System.out.println(name.concat(name2));//concatenation
//         System.out.println(name.equals(name2));//true
//         sc.close();
//     }
    
// }
