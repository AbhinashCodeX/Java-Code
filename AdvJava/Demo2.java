class A{

int age=0;
public void displayage(){
    System.out.println("This is calss A and age is "+age);
}


    class B{
        public void show(){
            System.out.println("This is class B and age is "+age);
        }

    }

}

public class Demo2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.displayage();  // This will print "This is class A and age is 0"
        A.B obj1= obj.new B();
        obj1.show();  // This will print "This is class B and age is 0"
    }
}
