package oops;
class A{
public A(){
    super();
    System.out.println("A class constructor");
    }

    public A(int x){
        super();
        System.out.println("A class constructor with parameter: " + x);
    }
}

class B extends A{
    public B(){
        super();
    System.out.println("B class constructor");
    }

    public B (int x){
        this();
        System.out.println("B class constructor with parameter: " + x);
    }

}

public class sup {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
