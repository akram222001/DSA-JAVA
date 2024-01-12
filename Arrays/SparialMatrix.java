import java.util.Scanner;
public class SparialMatrix{
    public static void printmatrix(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        //condition
        while(startCol<=endCol && startRow <=endRow){
        //top
        for(int j=startCol; j<=endCol;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        //right
        for(int i=startRow+1; i<=endRow; i++){
           System.out.print(matrix[endCol][i]+" ");
        }
        //botton
        for(int j=endCol-1; j>=startCol; j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        //left
        for(int i=endRow-1; i>=startRow+1; i++){
            if(startCol==endCol){
                break;
            }
            System.out.print(matrix[startCol][i]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
    System.out.println();
}
    public static void main(String args []){
        int matrix[][]={{1, 2, 3, 4 },
                        {6, 7, 8, 9},
                        {11, 12, 13, 14},
                        {17, 18 ,19 ,20}};
            printmatrix(matrix);
    }
}