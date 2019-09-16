public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // int[][] matrix = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
         int[][] matrix = new int[4][4];  // ez a sor ugyanaz, mint a feletti
            for ( int i =0; i < matrix.length; i++) {
                for ( int j = 0; j < 4; j++) {
                    if ( i == j){
                        matrix[i][j] = 1;
                        System.out.print(1 + " ");
                    }
                    else {
                        matrix[i][j] = 0;
                        System.out.print(0 + " ");
                    }

                }
                System.out.println();
        }
    }
}



