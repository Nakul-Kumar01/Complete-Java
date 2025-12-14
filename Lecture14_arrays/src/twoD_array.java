public class twoD_array {
    public static void main(String[] args) {

        // 2D array

        int[][] arr = new int[3][3];
        int[][] mat = {
                {1,2,3},  // arr[0]
                {4,5,6},  // arr[1]
                {7,8,9},  // arr[2]
        };

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged array: array with different no. of rows and columns
        char arr2[][] = new char[3][];
        arr2[0] = new char[3];
        arr2[1] = new char[6]; // with different no. of colums
        arr2[2] = new char[5];
    }
}
