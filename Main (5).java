import java.util.Scanner;
 class Main{
     public static void main(String[] args){
         for(int row = 1;row <= 5;row++){
             for(int col = 1;col <= 5-row;col++){
                 System.out.print(" ");
             }
             for(int col=1;col<=(2*row-1);col++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 }