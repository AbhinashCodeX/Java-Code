package basics;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Balance");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        int choice= sc.nextInt();
        int balance = 1000;

        switch (choice){
            case 1:

                System.out.println("Your Balance is:"+balance);
                break;

            case 2:
                System.out.println("Enter Amount to be withdraw:");
                int amt = sc.nextInt();
                if( amt <= balance){
                    balance = balance - amt;
                }
                else{
                    System.out.println("Insufficient Balance");
                }
                System.out.println("Withdraw Successful!");
                System.out.println("Remaining Balance is:"+ balance);
                break;

            case 3:
                 System.out.println("Enter Amount to be Deposited:");
                 int deposit = sc.nextInt();
                 balance = balance + deposit;
                     System.out.println("Deposit Successful!");
                     System.out.println("Remaining Balance is:"+ balance);
                 
                 break;


            default:
                 System.out.println("Exited Successful");
                 break;

        }


    }
}
