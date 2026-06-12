

@FunctionalInterface
interface calculator{
    int add(int a , int b);
}
public class t1 {
    public static void main(String[] args) {
calculator c = (a,b) -> a+b;
        System.out.println("Added Result is:"+c.add(5,7));

    }
}
