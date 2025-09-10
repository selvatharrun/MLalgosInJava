import java.util.*;
import java.lang.Math;

public class Main {
    
    public static double[] flattenX(double[][] lst){
        int len = lst.length * lst[0].length;
        double[] newList = new double[len];
        int index =0;
        
        for(double[] minilst: lst){
            for(double x: minilst){
                newList[index++] = x;
            }
        }

        return newList;
    }

    public static double[][] flattenY(double[][] lst) {
        // Count total elements
        int totalLength = 0;
        for (double[] row : lst) totalLength += row.length;

        double[][] newlst = new double[totalLength][1]; 
        // single row with all elements flattened
        int index = 0;

        for (double[] minilst : lst) {
            for (double x : minilst) {
                newlst[index++][0] = x;
            }
        }

        return newlst;
    }

    public static double[][] matrixMult(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrix1 columns must equal Matrix2 rows");
        }

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += Math.round(matrix1[i][k] * matrix2[k][j]*100.0)/100.0;
                }
            }
        }
        return result;
    }
    
    public static void print2D(double[][] arr) {
        for (double[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    public static void main(String[] args){
        double[][] x = {{0.1, 0.2}, {0.3,0.4}};
        
        double[][] flattened_x = flattenY(x);

        double[][] we = {{0.5,0.3,0.2,0.3}};

        double[][]res = matrixMult(we, flattened_x);

        print2D(res);

        
        double be = 0.2;

        double[][] wd ={{0.4},{0.2}, {0.1}, {0.3}};
        double[][] bd = {{0.1},{0.2},{0.3},{0.4}};

        for(double[] xmin: x){

        }
    }
}