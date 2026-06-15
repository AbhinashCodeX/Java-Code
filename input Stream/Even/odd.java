

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odd {
    public static void main(String[] args) throws IOException {
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number:");
        int a=Integer.parseInt(bf.readLine());
        if(a%2==0){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}