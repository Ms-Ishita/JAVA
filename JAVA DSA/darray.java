public class darray {
    public static void Mul(int[][] A, int[][] B, int r1, int c1, int r2, int c2 ){
        int[][] mul  = new int[r1][c2];
        for(int i = 0; i<r1; i++){
            for(int j = 0; j<c2; j++){
                for(int k =0; k<r2; k++){
                    mul[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i =0; i<r1; i++){
            for(int j =0; j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        int[][] A = {{2,3,4,5},{3,5,4,6}};
        int[][] B = {{6,7},{8,3},{3,4},{5,6}};
        Mul(A, B, 2, 4, 4, 2);


    }
}   