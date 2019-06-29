package question.array;

/*import org.junit.Test;
import org.junit.Before;
import org.junit.After;*/

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-28 10:46
 **/

public class rotate {
    /*
    public void rotate(int[][] matrix) {
        if(matrix==null)
            return;
        int n = matrix.length;
        for(int i=0; i<n;i++){
            for(int j=0;j<n-i;i++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = t;
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = t;
            }
        }
    }*/

    /*public void rotate(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][length - i - 1];
                matrix[length - j - 1][length - i - 1] = t;
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int t = matrix[j][i];
                matrix[j][i] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = t;
            }
        }
    }*/

    /*

        public void test(){
            int[][] test1 = new int[][]{
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            rotate(test1);


        }
    */
/*    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        rotate r = new rotate();
        r.rotate(array);
    }*/

    /*public void rotate(int[][] matrix){
        int n = matrix.length-1;
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<n-2*i;j++){
                changeFour(matrix,n-j-i,i,n);
            }
        }
    }

    static void changeFour(int[][] matrix, int x, int y, int n){
        int ins = matrix[x][y];
        matrix[x][y] = matrix[n-y][x];
        matrix[n-y][x] = matrix[n-x][n-y];
        matrix[n-x][n-y] = matrix[y][n-x];
        matrix[y][n-x] = ins;
    }*/


}





