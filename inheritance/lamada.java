@FunctionalInterface
interface A {
    void show();
}  


public class lamada {
    public static void main(String[] args) {
          A obj= ()-> System.out.println("Hello WOrld");

        obj.show();

    }
}
