@FunctionalInterface
interface  checkEven {
    boolean isEven(int n);
}
    public class t2 {
        public static void main(String[] args) {
            checkEven c = n ->  n%2 == 0;

            System.out.println(c.isEven(10));
            System.out.println(c.isEven(7));
        }

}

