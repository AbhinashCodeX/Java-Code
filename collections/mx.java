import java.util.ArrayList;

public class mx {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<Integer>();
        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);
        System.out.println(no);
        
        int max = no.get(0);
        for(int i=1 ; i<no.size() ; i++){
            if(no.get(i)>max){
                max = no.get(i);
            }
        }
        System.out.println("The Largest Element in the Array List is :" + max);
    }
}
