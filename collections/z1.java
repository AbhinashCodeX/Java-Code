import java.util.*;

public class z1 {
    public static void main(String[] args) {
//        List<Integer>nums = new ArrayList<Integer>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(5);

        Set<Integer> num = new TreeSet<Integer>();
        num.add(6);
        num.add(777);
        num.add(88);
        num.add(9);
        num.add(11);
        num.add(11);


        Iterator<Integer> values = num.iterator();   //we can use iterator to loop throught the given data set

        while(values.hasNext())
            System.out.println(values.next());

//        for(int n: num){
//            System.out.println(n);
//        }




//        System.out.println(nums.indexOf(2));
//        System.out.println(nums.get(4));
//        for(Object n : nums){
//            int num = (Integer)n;
//            System.out.println(num*2);
//        }

    }
}
