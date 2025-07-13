import java.util.*;
public class cf2 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        while(n>0){
            int x=obj.nextInt();
            int a=obj.nextInt();
            int b=obj.nextInt();
            int c=obj.nextInt();
            int count=(x/(a+b+c))*3;
            x=x%(a+b+c);
            
                if(x>0){
                    x=x-a;
                    count++;
                }
                if(x>0){
                    x=x-b;
                    count++;
                }
                if(x>0){
                    x=x-c;
                    count++;
                }
            
            System.out.println(count);
            n--;
        }
    }
}