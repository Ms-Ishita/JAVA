

public class cf1 {
    public static void tippiTroppi(String str){
        StringBuilder st= new StringBuilder(" ");
        String[] words = str.trim().split("\\s+");
        StringBuilder s =  new StringBuilder("");
        for(String word : words){
            if(!word. isEmpty()){
                s.append(word.charAt(0));
            }
        }
        System.out.print(s.toString());

    }
  public static void main(String[] args) {
    String str = "hello world";
    tippiTroppi(str);
  }  
}
