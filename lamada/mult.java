
@FunctionalInterface
interface calculator{
    int multply(int a , int b);
}


public class mult {
    public static void main(String[] args) {
        calculator c = (a,b) -> a*b;
        System.out.println("Multiplied Result is:"+c.multply(5,7));
    }
    
}
