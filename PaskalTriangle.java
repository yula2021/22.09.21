package com.company;

public class PaskalTriangle {
    public static int a[][];

    public static void main(String[] args) {
        int size = 7;
        int nRows = size, nCols = 2*size-1;
        a = new int [nRows][nCols];
        for (int i=0; i<nRows;i++)
            for (int j=0; j<nCols;j++)
                a[i][j] = 0;
         //заполнение
        for (int i=0; i<nRows;i++)
            for (int j=0; j<nCols;j++)
  if (i==0) a[i][nCols/2] = 1;
  else if (j==0) a[i][j] = a[i-1][j+1];
  else if (j == nCols-1) a[i][j] = a[i-1][j-1];
  else  a[i][j] = a[i-1][j-1] + a[i][j+1];

        }
        //Преобразовать в строку
        public static String arrToString() {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++)
                    if (a[i][j]!=0) {
                        String s = Integer.toString(a[i][j]);
                        String padded = String.format("%2s", s);
                        result.append(padded);
                    }
                    else result.append("  ");
                result.append("\n");
            }
            return result.toString();
        }
}


