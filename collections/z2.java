import java.util.HashMap;
import java.util.Map;

public class z2 {
    public static void main(String[] args) {
    Map<String,Integer> students = new HashMap<String,Integer>();
        students.put("Abhinash",1);
        students.put("som",2);
        students.put("rocky",3);
        students.put("somya",4);
        students.put("soham",5);
        System.out.println(students.keySet());   //to get the keys of the map
        System.out.println(students.values());   //to get the values of the map

        for(String s : students.keySet()){
            System.out.println(s + " : " + students.get(s) );
        }
        
    }
}
