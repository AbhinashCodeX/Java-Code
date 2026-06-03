

class A{
    void show(){
        System.out.println("In A");
    }
}

class B extends A{
    void show(){
     System.out.println("In B");
    }
}
class C extends A{
    void show(){
     System.out.println("In C");
    }
}

public class dynamic {
    public static void main(String[] args) {
        A a = new A();       
        a.show();
        a = new B();    
        a.show();
        a = new C();
        a.show();
    }
}
