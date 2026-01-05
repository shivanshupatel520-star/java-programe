package array;

import java.util.Scanner;

public class new2Darray {
    public static void main(String[] args) {
        int matrics [][] = new int[3][3];
        int n= matrics.length,m=matrics[0].length;

        Scanner sc= new Scanner(System.in);
        for(int i= 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrics[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i= 0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print( matrics[i][j] + " ");
            }
            System.out.println();
        }

    }

}
