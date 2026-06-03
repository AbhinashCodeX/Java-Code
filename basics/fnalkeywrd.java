

 class A{    //if we add final we cannot use the concept of inheritance
    public final void show(){
        System.out.println("In A");
    }
    public void add(int i , int j){
        System.out.println(i+j);
    }

}

class B extends A{
    public void show(){
        System.out.println("In B");
    }

}



public class fnalkeywrd {
    public static void main(String[] args) {
        // final int a = 9;   //final variable
        // a = 8;
        // System.out.println(a);
     B ob = new B();
    ob.show();
    ob.add(5, 6);


    }
}
