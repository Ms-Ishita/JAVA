import java.util.*;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
public class string2 {
    public static void sortString(String str){
        String[] word = str.split(" ");
       
        for(int i =0; i<word.length; i++){
            for(int j = i+1; j<word.length; j++){
                if(word[i].length()>word[j].length()){
                    String temp = word[j];
                    word[j]= word[i];
                    word[i]=temp;
                }
            }
            
        }
        for(int i =0; i<word.length; i++){
            System.out.print(word[i]+" ");
        }
    }

    public static void main(String[] args) {
        String str = "Apple kiwwi fig Banana";
        sortString(str);
    }
}

// public class string2 {
//     // public String longestCommonPrefix(String[] strs) {
//     //     StringBuilder st = new StringBuilder("");
//     //    Arrays.sort(strs);
//     //    char[] first = strs[0].toCharArray();
//     //    char[] last = strs[strs.length-1].toCharArray();
//     //    for(int i =0; i<first.length; i++){
//     //     if(first!=last){
//     //         break;
//     //         st.a
//     //     }
//     //    }
//     // }
//     public static void main(String[] args) {
//         // String[] str = new String[]{"flower","flow","flight"};
//         String str="Ishita";
//         System.out.println(str.substring(2));
//         System.out.println(str.substring(0,2));
//     }
// } 
=======
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

public class string2 {
    // public String longestCommonPrefix(String[] strs) {
    //     StringBuilder st = new StringBuilder("");
    //    Arrays.sort(strs);
    //    char[] first = strs[0].toCharArray();
    //    char[] last = strs[strs.length-1].toCharArray();
    //    for(int i =0; i<first.length; i++){
    //     if(first!=last){
    //         break;
    //         st.a
    //     }
    //    }
    // }
    public static void main(String[] args) {
        // String[] str = new String[]{"flower","flow","flight"};
        String str="Ishita";
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,2));
    }
} 
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes

