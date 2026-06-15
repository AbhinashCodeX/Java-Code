package Exception;

import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to Divide");
        int i= sc.nextInt();
        int j=0;
        int num[] = new int[5];
        
        try{
            j=18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch (Exception e){
            System.out.println("Your Exception is: "+ e);
        }
        System.out.println("Your Number was: " + i);
        System.out.println("Execution Was Normal ");
        System.out.println("Result Was: "+ j );
    }
}