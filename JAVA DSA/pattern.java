public class pattern {
    // public static void main(String[] args) {
    //     int n = 4;
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=n; j++){
    //             if(i==1 ||j ==1|| i==n ||j==n){
    //                 System.out.print(j+" ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String[] args) {
    //     int n = 4;
    //     int num = 1;
    //     for(int i = 1; i<=n ; i++){
    //         for(int j= i; j<=n; j++){
    //             System.out.print(num+" ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int s = 1; s<=n-i; s++){
                System.out.print("  ");

            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
