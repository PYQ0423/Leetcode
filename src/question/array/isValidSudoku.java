package question.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-27 14:21
 **/

public class isValidSudoku {
    // 每行，每列，每3个格子都要进行检查
    // 不能有与当前数相同的数存在
    // 是一个9*9的数组
    public boolean isValidSudoku(char[][] board) {
        // 长的边界0-8
        // 宽的边界0-8
        // 假设当前数的下标为board[i][j]
        // 则它所处的小矩形为一个小矩形的边界是，i%3,j%3，下标为3*(i%3)+0,+1,+2
        for(int i=0;i<9;i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> colume = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !colume.add(board[j][i]))
                    return false;
                int RowIndex = 3 * (i / 3) + j / 3;
                int ColIndex = 3 * (i % 3) + j % 3;
                if (board[RowIndex][ColIndex] != '.' && !cube.add(board[RowIndex][ColIndex]))
                    return false;
            }
        }
        return true;
    }


   /* public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> counter = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (counter.contains(c))
                        return false;
                    else {
                        counter.add(c);
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> counter = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    if (counter.contains(c))
                        return false;
                    else {
                        counter.add(c);
                    }
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Set<Character> counter = new HashSet<>();
                for(int m=0;m<3;m++){
                    for(int n=0;n<3;n++){
                        char c = board[i*3+m][j*3+n];
                        if(c!='.'){
                            if (c != '.') {
                                if (counter.contains(c))
                                    return false;
                                else {
                                    counter.add(c);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }*/

  /*  public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] cols = new int[9];
        int[] blks = new int[9];
        for(int ri=0;ri<9;++ri){
            for(int ci=0;ci<9;++ci){
                if(board[ri][ci]!='.'){
                    int bi = ri/3*3 + ci/3;
                    int uvb = 1<< (board[ri][ci] -'0');

                }
            }
        }


    }*/
}


