import java.util.*;
public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    int i;
    int j;
    
    for(i = a; i>=1; i--)
    {
         
       
        for(j = i; j<a; j++)
        {
            System.out.print(" ");
        }
         
      
        for(j = 1; j<=(2 * i - 1); j++)
        {
            System.out.print("*");
        }
         
       
        System.out.println("");
    }        
}
}