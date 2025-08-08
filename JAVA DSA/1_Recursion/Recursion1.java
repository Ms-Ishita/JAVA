public class Recursion1 {

    public static void headRecursion(int x){
        if(x==0)return;
        headRecursion(x-1);
        System.out.println("head "+ x);

    }
       public static void tailRecursion(int x){
        if(x==0)return;
        System.out.println("tail "+x);
        tailRecursion(x-1);

    }
    public static int fibonacci(int n){

      if(n<=1)return n ;
      return fibonacci(n-1)+fibonacci(n-2);
     


    }

    public static void main(String[] args) {
        headRecursion(5);
        System.out.println();
        tailRecursion(5);
        for(int i =0;i<=10; i++){
            System.out.println(fibonacci(i));
        }
    }
}