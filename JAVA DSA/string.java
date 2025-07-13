import java.util.HashMap;

public class string {
    public static void reverse(String s){
        s="hello world";
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length-1;
        while(start<end){
            char temp = chars[end];
            chars[end]=chars[start];
            chars[start]=temp;
            start++;
            end--;
        }
        System.out.println(new String(chars));

    }
    public static void countVowel(String s ){
        s = "abeiov";
        int vcount = 0;
        int cCount = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                vcount++;
            }
            else{
                cCount++;
            }
           
        }
        System.out.println(vcount);
        System.out.println(cCount);
        

    }
    public static void palindrome(String s){
        s = "madam";
        boolean ispalindrome = true;
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                ispalindrome= false;
                break;
            }
            start++;
            end--;
        }
        if(ispalindrome){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    public static void mostFrequent(String s){
        s = "shubhamsharma";
        int maxFreq = 0;
        char mostFreq =' ';
        char[] c = s.toCharArray();
        for(int i = 0; i<c.length; i++){
            int count = 0;
            for(int j = 0; j<c.length; j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
            if(count>maxFreq){
                maxFreq = count;
                mostFreq = c[i];
            }
        }
        System.out.println(mostFreq);
        System.out.println(maxFreq);
    }
    public static void removeDuplicates(String s ){
        //s = "aabbcc";
        HashMap<Character, Boolean> hash = new HashMap<>();
        StringBuilder str = new StringBuilder("");
        for(char ch : s.toCharArray()){
            if(!hash.containsKey(ch)){
                hash.put(ch, true);
                str.append(ch);
            }
        }
        System.out.println(str.toString());
    }
    public static void firstNonRepeting(String s){
        
        HashMap<Character, Integer> hash = new HashMap<>();
        for(char ch : s.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch,0)+1);

        }
        for(char ch: s.toCharArray()){
            if(hash.get(ch)>1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        String s = "aabbcc";
        reverse(s);
        palindrome(s);
        countVowel(s);
        mostFrequent(s);
        removeDuplicates(s);
        firstNonRepeting("banana");
       
        

    }
}

