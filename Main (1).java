import java.util.*;
public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i;
    int j;
    
    for(i=1;i<=a;i++){
        for(j=1;j<=b;j++){
            if(i==1||i==a){
                System.out.print("*");
            }
            else
            if(j==1 || j==b){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
    System.out.println();
    }
}
}