import java.util.HashMap;
import java.util.Scanner;

public class find {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        h.put("Abhinash",90);
        h.put("Adi",85);
        h.put("Suchi",80);
        System.out.print("Enter Student Name :");
        String name = s.nextLine();

        if(h.containsKey(name)){
            System.out.println("Marks :"+h.get(name));
        }else System.out.println("No Student Found");

    }
    
}
